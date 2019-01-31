package com.platform.auth.service;

import org.apache.commons.codec.binary.Base64;

import java.security.KeyPair;
import java.util.Map;

public class RSASecurityService {


    /**
     * 初始化公私钥
     *
     * @return
     */
    public Map<String, String> initKeys() throws Exception {
        KeyPair keyPair = RSASecurityUtil.getKeyPair();
        String privateKey = new String(Base64.encodeBase64(keyPair.getPrivate().getEncoded()));
        String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));

        return null;
    }
}
