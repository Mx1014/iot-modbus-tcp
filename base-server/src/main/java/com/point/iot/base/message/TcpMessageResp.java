package com.point.iot.base.message;

import org.apache.mina.core.buffer.IoBuffer;

import com.point.iot.utils.Constant;

public class TcpMessageResp {
	
	//协议类型
	private byte protocolType;
	
	// 表示命令号，下述功能中已给具体命令号
	private byte cmd;
	
	private byte[] data;
	
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public byte getCmd() {
		return cmd;
	}
	public void setCmd(byte cmd) {
		this.cmd = cmd;
	}
	public byte getProtocolType() {
		return protocolType;
	}
	public void setProtocolType(byte protocolType) {
		this.protocolType = Constant.CAIJIYI_TCP;
	}
	
	public IoBuffer encode(){
		IoBuffer buf = IoBuffer.allocate(10);
		buf.putInt(this.protocolType);
		buf.putInt(this.cmd);
		buf.flip();
		return buf;
	}
}
