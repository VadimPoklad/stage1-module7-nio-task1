package com.epam.mjc.nio;


import java.io.*;

public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file))){

            String str = bufferedReader.readLine();
            profile.setName(str.substring(str.indexOf(":")+2));

            str=bufferedReader.readLine();
            profile.setAge(Integer.parseInt(str.substring(str.indexOf(":")+2)));

            str=bufferedReader.readLine();
            profile.setEmail(str.substring(str.indexOf(":")+2));

            str=bufferedReader.readLine();
            profile.setPhone(Long.parseLong(str.substring(str.indexOf(":")+2)));

        } catch (FileNotFoundException e) {
            throw new NullPointerException();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return profile;
    }

}
