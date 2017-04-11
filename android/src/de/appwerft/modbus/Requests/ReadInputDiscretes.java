/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.modbus.Requests;

import java.util.ArrayList;
import java.util.List;

import net.wimpi.modbus.ModbusException;
import net.wimpi.modbus.io.ModbusTCPTransaction;
import net.wimpi.modbus.msg.ReadInputDiscretesRequest;
import net.wimpi.modbus.msg.ReadInputDiscretesResponse;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollFunction;
import org.appcelerator.kroll.KrollProxy;

import de.appwerft.modbus.MasterConnectionProxy;
import de.appwerft.modbus.RequestProxy;
import android.os.AsyncTask;

public class ReadInputDiscretes {
	KrollProxy proxy;

	public ReadInputDiscretes(MasterConnectionProxy proxy) {
		this.proxy = proxy;
		AsyncTask<MasterConnectionProxy, Void, List<KrollDict>> doRequest = new ModBusHandler();
		doRequest.execute();
	}

	public ReadInputDiscretes(RequestProxy proxy) {
		this.proxy = proxy;
		AsyncTask<MasterConnectionProxy, Void, List<KrollDict>> doRequest = new ModBusHandler();
		doRequest.execute();
	}

	private final class ModBusHandler extends
			AsyncTask<MasterConnectionProxy, Void, List<KrollDict>> {
		private KrollFunction onLoad;

		@Override
		protected List<KrollDict> doInBackground(
				MasterConnectionProxy... proxies) {
			MasterConnectionProxy proxy = proxies[0];
			ModbusTCPTransaction transaction;
			List<KrollDict> resList = new ArrayList<KrollDict>();

			try {
				proxy.getConnection().connect();
				transaction = new ModbusTCPTransaction(proxy.getConnection());
				transaction.setRequest(new ReadInputDiscretesRequest(proxy
						.getRef(), proxy.getCount()));
				int k = 0;
				do {
					try {
						transaction.execute();
					} catch (ModbusException e) {
						e.printStackTrace();
					}
					ReadInputDiscretesResponse response = (ReadInputDiscretesResponse) transaction
							.getResponse();
					KrollDict result = new KrollDict();
					result.put("bitcount", response.getBitCount());
					result.put("datalength", response.getDataLength());
					KrollDict discretes = new KrollDict();
					discretes.put("bytesize", response.getDiscretes()
							.byteSize());
					discretes.put("isLSBAccess", response.getDiscretes()
							.isLSBAccess());
					discretes.put("isMSBAccess", response.getDiscretes()
							.isMSBAccess());
					discretes.put("bytes", org.appcelerator.titanium.TiBlob
							.blobFromData(response.getDiscretes().getBytes()));
					result.put("discretes", discretes);
					resList.add(result);
					k++;
				} while (k < proxy.getRepeat());
			} catch (Exception e) {
				e.printStackTrace();
			}

			return resList;
		}

		protected void onPostExecute(List<KrollDict> resultList) {
			if (onLoad != null)
				onLoad.call(proxy.getKrollObject(), resultList.toArray());
		}

	}

}