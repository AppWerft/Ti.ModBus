/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2016 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

/** This code is generated, do not edit by hand. **/

#include "de.appwerft.modbus.ModbusModule.h"

#include "AndroidUtil.h"
#include "EventEmitter.h"
#include "JNIUtil.h"
#include "JSException.h"
#include "Proxy.h"
#include "ProxyFactory.h"
#include "TypeConverter.h"
#include "V8Util.h"


#include "de.appwerft.modbus.CouplerModule.h"

#include "de.appwerft.modbus.MasterConnectionProxy.h"
#include "de.appwerft.modbus.SimpleProcessImageProxy.h"

#include "org.appcelerator.kroll.KrollModule.h"

#define TAG "ModbusModule"

using namespace v8;

namespace de {
namespace appwerft {
namespace modbus {


Persistent<FunctionTemplate> ModbusModule::proxyTemplate;
jclass ModbusModule::javaClass = NULL;

ModbusModule::ModbusModule(jobject javaObject) : titanium::Proxy(javaObject)
{
}

void ModbusModule::bindProxy(Local<Object> exports, Local<Context> context)
{
	Isolate* isolate = context->GetIsolate();

	Local<FunctionTemplate> pt = getProxyTemplate(isolate);
	Local<Function> proxyConstructor = pt->GetFunction(context).ToLocalChecked();
	Local<String> nameSymbol = NEW_SYMBOL(isolate, "Modbus"); // use symbol over string for efficiency
	Local<Object> moduleInstance = proxyConstructor->NewInstance(context).ToLocalChecked();
	exports->Set(nameSymbol, moduleInstance);
}

void ModbusModule::dispose(Isolate* isolate)
{
	LOGD(TAG, "dispose()");
	if (!proxyTemplate.IsEmpty()) {
		proxyTemplate.Reset();
	}

	titanium::KrollModule::dispose(isolate);
}

Local<FunctionTemplate> ModbusModule::getProxyTemplate(Isolate* isolate)
{
	if (!proxyTemplate.IsEmpty()) {
		return proxyTemplate.Get(isolate);
	}

	LOGD(TAG, "GetProxyTemplate");

	javaClass = titanium::JNIUtil::findClass("de/appwerft/modbus/ModbusModule");
	EscapableHandleScope scope(isolate);

	// use symbol over string for efficiency
	Local<String> nameSymbol = NEW_SYMBOL(isolate, "Modbus");

	Local<FunctionTemplate> t = titanium::Proxy::inheritProxyTemplate(isolate,
		titanium::KrollModule::getProxyTemplate(isolate)
, javaClass, nameSymbol);

	proxyTemplate.Reset(isolate, t);
	t->Set(titanium::Proxy::inheritSymbol.Get(isolate),
		FunctionTemplate::New(isolate, titanium::Proxy::inherit<ModbusModule>)->GetFunction());

	titanium::ProxyFactory::registerProxyPair(javaClass, *t);

	// Method bindings --------------------------------------------------------

	Local<ObjectTemplate> prototypeTemplate = t->PrototypeTemplate();
	Local<ObjectTemplate> instanceTemplate = t->InstanceTemplate();

	// Delegate indexed property get and set to the Java proxy.
	instanceTemplate->SetIndexedPropertyHandler(titanium::Proxy::getIndexedProperty,
		titanium::Proxy::setIndexedProperty);

	// Constants --------------------------------------------------------------
	JNIEnv *env = titanium::JNIScope::getEnv();
	if (!env) {
		LOGE(TAG, "Failed to get environment in ModbusModule");
		//return;
	}


		DEFINE_INT_CONSTANT(isolate, prototypeTemplate, "TYPE_TCP", 0);


	// Dynamic properties -----------------------------------------------------

	// Accessors --------------------------------------------------------------

	return scope.Escape(t);
}

// Methods --------------------------------------------------------------------

// Dynamic property accessors -------------------------------------------------


} // modbus
} // appwerft
} // de
