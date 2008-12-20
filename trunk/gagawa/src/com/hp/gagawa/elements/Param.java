package com.hp.gagawa.elements;

import com.hp.gagawa.Node;

/**
(c) Copyright 2008 Hewlett-Packard Development Company, L.P.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.*/


public class Param extends Node {

	public Param(String name){
		super("param");
		setName(name);	}


	public Param setName(String value){setAttribute("name", value); return this;}
	public String getName(){return getAttribute("name");}
	public boolean removeName(){return removeAttribute("name");}

	public Param setType(String value){setAttribute("type", value); return this;}
	public String getType(){return getAttribute("type");}
	public boolean removeType(){return removeAttribute("type");}

	public Param setValue(String value){setAttribute("value", value); return this;}
	public String getValue(){return getAttribute("value");}
	public boolean removeValue(){return removeAttribute("value");}

	public Param setValuetype(String value){setAttribute("valuetype", value); return this;}
	public String getValuetype(){return getAttribute("valuetype");}
	public boolean removeValuetype(){return removeAttribute("valuetype");}

	public Param setId(String value){setAttribute("id", value); return this;}
	public String getId(){return getAttribute("id");}
	public boolean removeId(){return removeAttribute("id");}

}
