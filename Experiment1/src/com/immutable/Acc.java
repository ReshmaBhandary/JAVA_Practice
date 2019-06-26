package com.immutable;

import com.serializable.Address;

public class Acc {
		private int id;
		private String name;
		private Address adr;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Address getAdr() {
			return adr;
		}
		public void setAdr(Address adr) {
			this.adr = adr;
		}
		
		public Acc(int id, String name, Address adr) {
			super();
			this.id = id;
			this.name = name;
			this.adr = adr;
		}
		@Override
		public String toString() {
			return "Acc [id=" + id + ", name=" + name + ", adr=" + adr + "]";
		}
		
		
		
}
