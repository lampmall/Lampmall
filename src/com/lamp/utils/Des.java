package com.lamp.utils;


import javax.crypto.*;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by Administrator on 2017/6/21 0021.
 */
public class Des {
    //创建key
    public static void createKey(){
        try {
            KeyGenerator generator=KeyGenerator.getInstance("DES");
            generator.init(new SecureRandom());
            //创建key
            SecretKey key=generator.generateKey();
            FileOutputStream out =new FileOutputStream("key.xml");
            ObjectOutputStream oo=new ObjectOutputStream(out);
            oo.writeObject(key);
            oo.flush();
            oo.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SecretKey readKey(){
        SecretKey key=null;
        try {
            FileInputStream in=new FileInputStream("key.xml");
            ObjectInputStream ob=new ObjectInputStream(in);
            key=(SecretKey)ob.readObject();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return key;
    }
    //加密
    public static String encrypt(String password){
        try
        {
            Cipher cipher = Cipher.getInstance("DES");
            //初始化--指定加密所使用的key
            cipher.init(Cipher.ENCRYPT_MODE, readKey());
            ByteArrayInputStream bin=new ByteArrayInputStream(password.getBytes());
            //加密
            CipherInputStream in=new CipherInputStream(bin, cipher);
            FileOutputStream out=new FileOutputStream("data.xml");
            byte bs[]=new byte[1024];
            int count=0;
            while((count=in.read(bs))!=-1){
                out.write(bs,0,count);
                out.flush();
            }
            out.close();
            in.close();
            bin.close();


        } catch (Exception e) {
            // TODO: handle exception
        }
        return "1";
    }
}
