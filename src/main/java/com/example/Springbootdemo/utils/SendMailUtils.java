package com.example.Springbootdemo.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

/**
 * @author pyt
 * @createTime 2018年10月30日下午3:01:21
 */
public class SendMailUtils {
	private static String  FROM="2630451673@qq.com";// 发件人电子邮箱
    private static String  VCode="trfyznbsucbcebcb";//授权码或者账号密码
    // 方法一：必须要用授权码
    public static void sendMail(String email,String code,String title){
        // 1.创建连接对象javax.mail.Session
        // 2.创建邮件对象 javax.mail.Message
        // 3.发送一封激活邮件
        String host = "smtp.qq.com"; // 指定发送邮件的主机smtp.qq.com(QQ)|smtp.163.com(网易)
        Properties properties = System.getProperties();// 获取系统属性
        properties.setProperty("mail.smtp.host", host);// 设置邮件服务器
        properties.setProperty("mail.smtp.auth", "true");// 打开认证
        try {
            //QQ邮箱需要下面这段代码，163邮箱不需要
            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);
            // 1.获取默认session对象
            Session session = Session.getDefaultInstance(properties, new Authenticator() {                
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(FROM, VCode); // 发件人邮箱账号、授权码
                }
            });
            // 2.创建邮件对象
            Message message = new MimeMessage(session);
            // 2.1设置发件人
            message.setFrom(new InternetAddress(FROM));
            // 2.2设置接收人
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            // 2.3设置邮件主题
            message.setSubject(title);
            // 2.4设置邮件内容
            String content = "<html><head></head><body><h1>这是一封"+title+"邮件</h1><h3>动态验证码："
                    + code + " </h3>请在5分钟内完成验证。如非本人操作请忽略。</body></html>";
            message.setContent(content, "text/html;charset=UTF-8");
            // 3.发送邮件
            Transport.send(message);
            System.out.println("邮件成功发送!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

