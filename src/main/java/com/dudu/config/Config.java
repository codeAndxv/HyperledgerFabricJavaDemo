package com.dudu.config;

import java.io.File;

public class Config {

	public static final String LOCALHOST = "IPADDRESS";

	public static final String AFFILIATION = "affiliation1";

	public static final String ORG1_MSP = "Org1MSP";

	public static final String ORG1 = "org1";

	public static final String ORG2_MSP = "Org2MSP";

	public static final String ORG2 = "org2";

	public static final String CA1_ADMIN = "admin";

	public static final String CA1_ADMIN_PASSWORD = "adminpw";

	public static final String ORG1_ADMIN = "admin1";

	public static final String ORG1_ADMIN_PASSWORD = "admin1pw";

	public static final String ORG2_ADMIN = "admin2";

	public static final String ORG2_ADMIN_PASSWORD = "admin2pw";

	public static final String ROOT_BASE = System.getProperty("user.dir") + File.separator + "network_resources" +File.separator ;

	public static final String CHANNEL_CONFIG_PATH = ROOT_BASE + "channel-artifacts/channel.tx";
	
	public static final String ORG1_USR_BASE_PATH = ROOT_BASE + "crypto-config" + File.separator + "peerOrganizations" + File.separator
			+ "org1.example.com" + File.separator + "users" + File.separator + "Admin@org1.example.com"
			+ File.separator + "msp";
	
	public static final String ORG2_USR_BASE_PATH = ROOT_BASE + "crypto-config" + File.separator + "peerOrganizations" + File.separator
			+ "org2.example.com" + File.separator + "users" + File.separator + "Admin@org2.example.com"
			+ File.separator + "msp";
	
	public static final String ORG1_USR_ADMIN_PK = ORG1_USR_BASE_PATH + File.separator + "keystore";
	public static final String ORG1_USR_ADMIN_CERT = ORG1_USR_BASE_PATH + File.separator + "admincerts";

	public static final String ORG2_USR_ADMIN_PK = ORG2_USR_BASE_PATH + File.separator + "keystore";
	public static final String ORG2_USR_ADMIN_CERT = ORG2_USR_BASE_PATH + File.separator + "admincerts";
	
	public static final String CA_ORG1_URL = "http://"+LOCALHOST+":7054";
	
	public static final String CA_ORG2_URL = "http://"+LOCALHOST+":8054";
	
	public static final String ORDERER_URL = "grpc://"+LOCALHOST+":7050";
	
	public static final String ORDERER_NAME = "orderer.example.com";
	
	public static final String CHANNEL_NAME = "mychannel";
	
	public static final String ORG1_PEER_0 = "peer0.org1.example.com";
	
	public static final String ORG1_PEER_0_URL = "grpc://"+LOCALHOST+":7051";

	public static final String ORG1_PEER_0_EVENTHUB_URL = "grpc://"+LOCALHOST+":7053";

	public static final String ORG1_PEER_1 = "peer1.org1.example.com";
	
	public static final String ORG1_PEER_1_URL = "grpc://"+LOCALHOST+":8051";

	public static final String ORG1_PEER_1_EVENTHUB_URL = "grpc://"+LOCALHOST+":8053";
	
    public static final String ORG2_PEER_0 = "peer0.org2.example.com";
	
	public static final String ORG2_PEER_0_URL = "grpc://"+LOCALHOST+":9051";

	public static final String ORG2_PEER_0_EVENTHUB_URL = "grpc://"+LOCALHOST+":9053";
	
	public static final String ORG2_PEER_1 = "peer1.org2.example.com";
	
	public static final String ORG2_PEER_1_URL = "grpc://"+LOCALHOST+":10051";

	public static final String ORG2_PEER_1_EVENTHUB_URL = "grpc://"+LOCALHOST+":10053";
	
	public static final String CHAINCODE_ROOT_DIR = ROOT_BASE + "chaincode";
	
	public static final String CHAINCODE_1_NAME = "datamarket";
	
	public static final String CHAINCODE_1_PATH = "github.com/datamarket";
	
	public static final String CHAINCODE_1_VERSION = "1";

	public static final String PRIVATEDATA_CONFIG = ROOT_BASE + "collectionProperties" + File.separator + "PrivateDataIT.yaml";


}
