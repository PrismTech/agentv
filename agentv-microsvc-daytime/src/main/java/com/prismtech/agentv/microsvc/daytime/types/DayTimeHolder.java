package com.prismtech.agentv.microsvc.daytime.types;

/**
* com/prismtech/agentv/capsule/daytime/types/DayTimeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/types.idl
* Tuesday, February 9, 2016 11:46:34 PM CET
*/

public final class DayTimeHolder implements org.omg.CORBA.portable.Streamable
{
  public DayTime value = null;

  public DayTimeHolder ()
  {
  }

  public DayTimeHolder (DayTime initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DayTimeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DayTimeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DayTimeHelper.type ();
  }

}
