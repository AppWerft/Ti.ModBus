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
import org.appcelerator.kroll.KrollObject;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiC;

import de.appwerft.modbus.Requests.ReadCoils;
import de.appwerft.modbus.Requests.ReadInputDiscretes;
import de.appwerft.modbus.Requests.ReadRegisters;
import android.os.AsyncTask;

// This proxy can be created by calling Modbus.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule = ModbusModule.class)
public class MasterConnectionProxy extends KrollProxy {
	// Standard Debugging variables
	private static final String LCAT = "Modbus";
	private TCPMasterConnection conn;
	static int DEFAULTPORT = 502;
	private int ref = 0;
	private int count = 0;
	private int repeat = 1;
	public KrollObject krollObject = getKrollObject();

	public TCPMasterConnection getConnection() {
		return conn;
	}

	public int getCount() {
		return count;
	}

	public int getRepeat() {
		return repeat;
	}

	public int getRef() {
		return ref;
	}

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
				conn = new TCPMasterConnection(InetAddress.getByName(url
						.getHost()));
				int port = DEFAULTPORT;
				if (url.getPort() != 0) {
					conn.setPort(port);
				} else
					conn.setPort(DEFAULTPORT);

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
	public void readInputDiscretes(KrollDict opts) {
		new ReadInputDiscretes(this);
	}

	@Kroll.method
	public void readCoils(KrollDict opts) {
		new ReadCoils(this);
	}

	@Kroll.method
	public void readRegisters(KrollDict opts) {
		new ReadRegisters(this);
	}

	@Kroll.method
	public void request(KrollDict opts) {

	}
}