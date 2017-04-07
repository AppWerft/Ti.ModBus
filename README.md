Ti.ModBus
=========

This Titanium module realized a gateway to TCP based [modbus protocol](https://en.wikipedia.org/wiki/Modbus) 

<img src="https://home-assistant.io/images/supported_brands/modbus.png" width=580 />

Quick start
-----------

```javascript
var Modbus = require("de.appwerft.modbus");

Modbus.createMasterConnection({
	url : "modbus://192.168.0.1:7080",
	count : 3,
	ref : 1
});

```