package com.yangc.bridge.protocol;

public class ProtocolFile extends Protocol {

	private short fileNameLength; // 2byte
	private byte[] fileName;
	private long fileSize; // 8byte
	private byte[] fileMd5; // 32byte
	private short offset; // 2byte
	private byte[] data;

	public short getFileNameLength() {
		return fileNameLength;
	}

	public void setFileNameLength(short fileNameLength) {
		this.fileNameLength = fileNameLength;
	}

	public byte[] getFileName() {
		return fileName;
	}

	public void setFileName(byte[] fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public byte[] getFileMd5() {
		return fileMd5;
	}

	public void setFileMd5(byte[] fileMd5) {
		this.fileMd5 = fileMd5;
	}

	public short getOffset() {
		return offset;
	}

	public void setOffset(short offset) {
		this.offset = offset;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}