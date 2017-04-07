Ti.ModBus
=========

This Titanium module realized a gateway to TCP based [modbus protocol](https://en.wikipedia.org/wiki/Modbus) 

<img src="https://home-assistant.io/images/supported_brands/modbus.png" width=480 />

##Modbus Protocol Basics
Basically Modbus is an application layer protocol (see Figure 1) for communication between devices, mainly to exchange data typical for the field of automation.
![](http://jamod.sourceforge.net/images/modbus_vs_iso.png)
At this level Modbus is a stateless client-server protocol (e.g. much like HTTP), based on transactions, which consist of a request (issued by the client) and a response (issued by the server). In the field where this protocol is usually applied, there exists a concept that is one of the possible schemas governing the lower level communication behavior on a network using a shared signal cable: Master-Slave. To prevent confusion, the following directed relations describe Master-Slave in terms of the Client-Server paradigm:

    the master is a client.
    the slave is a server.

A transaction and it's context is visualized in Figure 2.
Figure 2: Modbus Transaction

The stateless communication is based on a simple package, that is called Protocol Data Unit (PDU). The protocol specification defines three types of PDU's:

    Request PDU, consisting of:
        a code specifying a function (Function Code, 1 byte)
        and function specific data (Function Data, varying number of bytes)
    Response PDU, consisting of:
        the function code corresponding to the request (Function Code, 1 byte)
        and response specific data (Response Data, varying number of bytes)
    Exception Response PDU, consisting of:
        the function code corresponding to the request + 0x80 (128), (Error Code, 1 byte)
        and a code specifying the exception (Exception Code, 1 byte)

![](http://jamod.sourceforge.net/images/modbus_pdu.png)


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