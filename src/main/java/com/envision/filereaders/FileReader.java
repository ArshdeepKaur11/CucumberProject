package com.envision.filereaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class FileReader {
         private static HashMap<Object, Object> actitimedata = new HashMap<>();
        static {
            if (actitimedata.size() == 0) {
                readProperties();
            }
        }
        private static void readProperties() {
            File f = new File("testData");
            if (f.isDirectory()) {
                for (File eachPropFile : f.listFiles()) {
                    try {
                        FileInputStream fis = new FileInputStream(eachPropFile);
                        Properties p = new Properties();
                        p.load(fis);
                        actitimedata.putAll(p);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        public static String getPropertyValue(String key) {
            return actitimedata.get(key).toString();
        }

}
