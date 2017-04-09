/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 * Warning: This file is GENERATED, and should not be modified
 */
var bootstrap = kroll.NativeModule.require("bootstrap"),
	invoker = kroll.NativeModule.require("invoker"),
	Titanium = kroll.binding("Titanium").Titanium;

function moduleBootstrap(moduleBinding) {
	function lazyGet(object, binding, name, namespace) {
		return bootstrap.lazyGet(object, binding,
			name, namespace, moduleBinding.getBinding);
	}

	var module = moduleBinding.getBinding("de.appwerft.modbus.ModbusModule")["Modbus"];
	var invocationAPIs = module.invocationAPIs = [];
	module.apiName = "Modbus";

	function addInvocationAPI(module, moduleNamespace, namespace, api) {
		invocationAPIs.push({ namespace: namespace, api: api });
	}

		addInvocationAPI(module, "Modbus", "Modbus", "createMasterConnection");
	addInvocationAPI(module, "Modbus", "Modbus", "createSimpleProcessImage");

			if (!("__propertiesDefined__" in module)) {		
		Object.defineProperties(module, {
			"MasterConnection": {
				get: function() {
					var MasterConnection = lazyGet(this, "de.appwerft.modbus.MasterConnectionProxy", "MasterConnection", "MasterConnection");
					return MasterConnection;
				},
				configurable: true
			},
			"Coupler": {
				get: function() {
					var Coupler = lazyGet(this, "de.appwerft.modbus.CouplerModule", "Coupler", "Coupler");
					return Coupler;
				},
				configurable: true
			},
			"SimpleProcessImage": {
				get: function() {
					var SimpleProcessImage = lazyGet(this, "de.appwerft.modbus.SimpleProcessImageProxy", "SimpleProcessImage", "SimpleProcessImage");
					return SimpleProcessImage;
				},
				configurable: true
			},
		
		});
		module.constructor.prototype.createMasterConnection = function() {
			return new module.MasterConnection(arguments);
		}
		module.constructor.prototype.createSimpleProcessImage = function() {
			return new module.SimpleProcessImage(arguments);
		}
		}
		module.__propertiesDefined__ = true;
		return module;

}
exports.bootstrap = moduleBootstrap;
