package com.axis.di;

public class Laptop {

	private HardDisk hardDisk;

	public Laptop() {

	}

	public Laptop(HardDisk hardDisk) { // HAS A relationship
		super();
		this.hardDisk = hardDisk;
	}

	public HardDisk getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}

	public static void main(String[] args) {

		HardDisk hd = new SamsungHD(); // new KingstonHD();

		// Laptop laptop = new Laptop(hd);

		Laptop laptop = new Laptop();

		laptop.setHardDisk(hd);

		System.out.println(laptop.hardDisk.brand());
		System.out.println(laptop.hardDisk.capacity());

	}

}
