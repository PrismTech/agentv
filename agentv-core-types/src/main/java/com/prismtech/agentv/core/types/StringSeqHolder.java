package com.prismtech.agentv.core.types;


/**
* com/prismtech/agentv/core/types/StringSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:24:59 PM CET
*/

public final class StringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public StringSeqHolder ()
  {
  }

  public StringSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.prismtech.agentv.core.types.StringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.prismtech.agentv.core.types.StringSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.prismtech.agentv.core.types.StringSeqHelper.type ();
  }

}
