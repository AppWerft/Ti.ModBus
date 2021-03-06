/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.modbus;

import net.wimpi.modbus.Modbus;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

@Kroll.module(name = "Modbus", id = "de.appwerft.modbus")
public class ModbusModule extends KrollModule {
	@Kroll.constant
	final static int TYPE_TCP = 0;
	@Kroll.constant
	final static int TYPE_UDP = 1;
	@Kroll.constant
	final static int READ_MULTIPLE_REGISTERS = Modbus.READ_MULTIPLE_REGISTERS;
	@Kroll.constant
	final static int READ_INPUT_DISCRETES = Modbus.READ_INPUT_DISCRETES;
	@Kroll.constant
	final static int READ_INPUT_REGISTERS = Modbus.READ_INPUT_REGISTERS;
	@Kroll.constant
	final static int READ_COILS = Modbus.READ_COILS;
	@Kroll.constant
	final static int WRITE_MULTIPLE_REGISTERS = Modbus.WRITE_MULTIPLE_REGISTERS;
	@Kroll.constant
	final static int WRITE_SINGLE_REGISTER = Modbus.WRITE_SINGLE_REGISTER;
	@Kroll.constant
	final static int WRITE_COIL = Modbus.WRITE_COIL;
	@Kroll.constant
	final static int WRITE_MULTIPLE_COILS = Modbus.WRITE_MULTIPLE_COILS;

	public ModbusModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
	}

}
