/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2016 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

/** This is generated, do not edit by hand. **/

#include <jni.h>

#include "Proxy.h"

namespace de {
namespace appwerft {
namespace modbus {
	namespace modbus {

class MasterConnectionProxy : public titanium::Proxy
{
public:
	explicit MasterConnectionProxy(jobject javaObject);

	static void bindProxy(v8::Local<v8::Object>, v8::Local<v8::Context>);
	static v8::Local<v8::FunctionTemplate> getProxyTemplate(v8::Isolate*);
	static void dispose(v8::Isolate*);

	static jclass javaClass;

private:
	static v8::Persistent<v8::FunctionTemplate> proxyTemplate;

	// Methods -----------------------------------------------------------
	static void readRegisters(const v8::FunctionCallbackInfo<v8::Value>&);
	static void readCoils(const v8::FunctionCallbackInfo<v8::Value>&);
	static void readInputDiscretesRequest(const v8::FunctionCallbackInfo<v8::Value>&);
	static void readInputDiscretes(const v8::FunctionCallbackInfo<v8::Value>&);

	// Dynamic property accessors ----------------------------------------

};

	} // namespace modbus
} // modbus
} // appwerft
} // de
