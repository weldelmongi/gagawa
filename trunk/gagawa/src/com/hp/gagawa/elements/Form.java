package com.hp.gagawa.elements;

import com.hp.gagawa.FertileNode;

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


public class Form extends FertileNode {

	public Form(String action){
		super("form");
		setAction(action);	}


	public Form setAction(String value){setAttribute("action", value); return this;}
	public String getAction(){return getAttribute("action");}
	public boolean removeAction(){return removeAttribute("action");}

	public Form setAccept(String value){setAttribute("accept", value); return this;}
	public String getAccept(){return getAttribute("accept");}
	public boolean removeAccept(){return removeAttribute("accept");}

	public Form setAcceptCharset(String value){setAttribute("accept-charset", value); return this;}
	public String getAcceptCharset(){return getAttribute("accept-charset");}
	public boolean removeAcceptCharset(){return removeAttribute("accept-charset");}

	public Form setEnctype(String value){setAttribute("enctype", value); return this;}
	public String getEnctype(){return getAttribute("enctype");}
	public boolean removeEnctype(){return removeAttribute("enctype");}

	public Form setMethod(String value){setAttribute("method", value); return this;}
	public String getMethod(){return getAttribute("method");}
	public boolean removeMethod(){return removeAttribute("method");}

	public Form setName(String value){setAttribute("name", value); return this;}
	public String getName(){return getAttribute("name");}
	public boolean removeName(){return removeAttribute("name");}

	public Form setTarget(String value){setAttribute("target", value); return this;}
	public String getTarget(){return getAttribute("target");}
	public boolean removeTarget(){return removeAttribute("target");}

	public Form setId(String value){setAttribute("id", value); return this;}
	public String getId(){return getAttribute("id");}
	public boolean removeId(){return removeAttribute("id");}

	public Form setCSSClass(String value){setAttribute("class", value); return this;}
	public String getCSSClass(){return getAttribute("class");}
	public boolean removeCSSClass(){return removeAttribute("class");}

	public Form setTitle(String value){setAttribute("title", value); return this;}
	public String getTitle(){return getAttribute("title");}
	public boolean removeTitle(){return removeAttribute("title");}

	public Form setStyle(String value){setAttribute("style", value); return this;}
	public String getStyle(){return getAttribute("style");}
	public boolean removeStyle(){return removeAttribute("style");}

	public Form setDir(String value){setAttribute("dir", value); return this;}
	public String getDir(){return getAttribute("dir");}
	public boolean removeDir(){return removeAttribute("dir");}

	public Form setLang(String value){setAttribute("lang", value); return this;}
	public String getLang(){return getAttribute("lang");}
	public boolean removeLang(){return removeAttribute("lang");}

	public Form setXMLLang(String value){setAttribute("xml:lang", value); return this;}
	public String getXMLLang(){return getAttribute("xml:lang");}
	public boolean removeXMLLang(){return removeAttribute("xml:lang");}

}
