// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.quickstart.server.testapp;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class TestRecursive {

	@TarsStructProperty(order = 0, isRequire = false)
	public int value = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public TestRecursive testRecursive = null;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TestRecursive getTestRecursive() {
		return testRecursive;
	}

	public void setTestRecursive(TestRecursive testRecursive) {
		this.testRecursive = testRecursive;
	}

	public TestRecursive() {
	}

	public TestRecursive(int value, TestRecursive testRecursive) {
		this.value = value;
		this.testRecursive = testRecursive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(value);
		result = prime * result + TarsUtil.hashCode(testRecursive);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TestRecursive)) {
			return false;
		}
		TestRecursive other = (TestRecursive) obj;
		return (
			TarsUtil.equals(value, other.value) &&
			TarsUtil.equals(testRecursive, other.testRecursive) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(value, 0);
		if (null != testRecursive) {
			_os.write(testRecursive, 1);
		}
	}

	static TestRecursive cache_testRecursive;
	static { 
		cache_testRecursive = new TestRecursive();
	}

	public void readFrom(TarsInputStream _is) {
		this.value = _is.read(value, 0, false);
		this.testRecursive = (TestRecursive) _is.read(cache_testRecursive, 1, false);
	}

}
