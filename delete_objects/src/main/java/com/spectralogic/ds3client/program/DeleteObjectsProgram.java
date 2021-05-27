package com.spectralogic.ds3client.program;

import com.spectralogic.ds3client.Ds3Client;
import com.spectralogic.ds3client.Ds3ClientBuilder;
import com.spectralogic.ds3client.commands.DeleteObjectRequest;
import com.spectralogic.ds3client.commands.spectrads3.GetSystemInformationSpectraS3Request;
import com.spectralogic.ds3client.commands.spectrads3.GetSystemInformationSpectraS3Response;
import com.spectralogic.ds3client.models.common.Credentials;
import com.spectralogic.ds3client.networking.FailedRequestException;
import com.spectralogic.ds3client.networking.FailedRequestUsingMgmtPortException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.UnknownHostException;

public class DeleteObjectsProgram {
    public static void main(final String args[]) {
        if (args.length < 4) {
            System.out.println("Must specify args: endpoint accessKey secretKey fileWithObjectsToDelete");
            return;
        }
        final String endpoint = args[0];
        final String access = args[1];
        final String secret = args[2];
        final String fileToDelete = args[3];

        System.out.printf("Arguments: endpoint=%s accessKey=%s secretKey=%s fileWithObjectsToDelete=%s\n", endpoint, access, secret, fileToDelete);

        // Get a client builder and then build a client instance.  This is the main entry point to the SDK.
        try (final Ds3Client client = Ds3ClientBuilder.create(endpoint, new Credentials(access, secret)).withHttps(false).build()) {

            // system info -- check connection
            final GetSystemInformationSpectraS3Response sysreponse = client.getSystemInformationSpectraS3(new GetSystemInformationSpectraS3Request());
            System.out.println(sysreponse.getSystemInformationResult().getApiVersion());

            BufferedReader csvReader = new BufferedReader(new FileReader(fileToDelete));
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split("\\|");
                if (data.length < 3) {
                    continue;
                }
                final String bucketName = data[0].trim();
                final String objectId = data[1].trim();
                final String objectName = data[2].trim();

                try {
                    client.deleteObject(new DeleteObjectRequest(bucketName, objectName).withVersionId(objectId));
                } catch (final Exception e) {
                    System.out.printf("Failed to delete object '%s' in bucket '%s': %s\n", objectName, bucketName, e);
                }
            }
            csvReader.close();
            System.out.println("Finished");

            // Catch unknown host exceptions.
        } catch (final UnknownHostException e) {

            System.out.println("Invalid Endpoint Server Name or IP Address");

            // Catch unknown host exceptions.
        } catch (final FailedRequestUsingMgmtPortException e) {

            System.out.println("Attempted data access on management port -- check endpoint");

            // Catch failed requests with unexpected status codes.
        } catch (final FailedRequestException e) {

            // If this is invalid authorization.
            if (e.getStatusCode() == 403) {

                System.out.println("Invalid Access ID or Secret Key");

                // Else unexpected status code.
            } else {

                System.out.println("BlackPearl return an unexpected status code we did not expect");
                // e.getStatusCode() can be used to get the status code BlackPearl returned for more accurate error handling and detection

            }

        } catch (final IOException e) {

            System.out.printf("Encountered error: %s\n", e.toString());

        }
    }
}
