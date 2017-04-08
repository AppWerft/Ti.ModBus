/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.modbus;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import net.wimpi.modbus.ModbusException;
import net.wimpi.modbus.io.ModbusTCPTransaction;
import net.wimpi.modbus.msg.ReadInputDiscretesRequest;
import net.wimpi.modbus.msg.ReadInputDiscretesResponse;
import net.wimpi.modbus.net.TCPMasterConnection;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollFunction;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiC;

import android.os.AsyncTask;

// This proxy can be created by calling Modbus.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule = ModbusModule.class)
public class MasterConnectionProxy extends KrollProxy {
	// Standard Debugging variables
	private static final String LCAT = "Modbus";
	static int DEFAULTPORT = 502;
	int ref = 0;
	int count = 0;
	int repeat = 1;

	private void createConn(KrollDict opts) {
		KrollDict options = opts;
		if (options.containsKeyAndNotNull("ref"))
			ref = options.getInt("ref");
		if (options.containsKeyAndNotNull("count"))
			ref = options.getInt("count");
		if (options.containsKeyAndNotNull("repeat"))
			ref = options.getInt("repeat");
		URL url = null;
		if (options.containsKeyAndNotNull(TiC.PROPERTY_URL)) {
			try {
				url = new URL(options.getString(TiC.PROPERTY_URL));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		if (url != null)
			try {
				// Open the connection
				TCPMasterConnection con = new TCPMasterConnection(
						InetAddress.getByName(url.getHost()));
				int port = DEFAULTPORT;
				if (url.getPort() != 0) {
					con.setPort(port);
				} else
					con.setPort(DEFAULTPORT);

			} catch (Exception e) {
				e.printStackTrace();
			}
		else
			Log.e(LCAT, "URL invalide or empty");

	}

	@Override
	public void handleCreationDict(KrollDict options) {
		super.handleCreationDict(options);
		createConn(options);

	}

	@Kroll.method
	public ReadInputDiscretesRequestProxy createReadInputDiscretesRequest(
			KrollDict opts) {
		ReadInputDiscretesRequestProxy proxy = new ReadInputDiscretesRequestProxy(
				opts);
		return proxy;
	}
}