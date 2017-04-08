/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.modbus;

import net.wimpi.modbus.ModbusCoupler;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(parentModule = ModbusModule.class)
public class CouplerModule extends KrollModule {

	public CouplerModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
	}

	@Kroll.method
	public void setProcessImage(SimpleProcessImageProxy proxy) {
		ModbusCoupler.getReference().setProcessImage(proxy.spi);
	}

	@Kroll.method
	public void setMaster(Object o) {
		if (o instanceof Boolean)
			ModbusCoupler.getReference().setMaster((boolean) o);
	}

	@Kroll.method
	public void setUnitID(int id) {
		ModbusCoupler.getReference().setUnitID(id);
	}
}
