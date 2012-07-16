package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */

    public class InputDevice {
        private final BufferedReader reader;

        public InputDevice() {
            reader=new BufferedReader(new InputStreamReader(System.in));

        }

        public int readint(){
            return (Integer.parseInt(readInput()));
        }

        public String readInput() {
            try
            {
                return reader.readLine();
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
    }



