package org.netty;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * socksserver启动类
 * 
 * @author zhaohui
 * 
 */
public class Start {

	private static Logger log = LoggerFactory.getLogger(Start.class);

	static {
		//手动启动日志
		InputStream in = Start.class.getClassLoader().getResourceAsStream("log.properties");
		PropertyConfigurator.configure(in);
	}

	public static void main(String[] args) {
		log.info("SocksClient 启动中...");

		SocksServer.getInstance().start();
	}
}
