package com.prismtech.agentv.core.types;

/**
* com/prismtech/agentv/core/types/RunningMicrosvcHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/nodeinfo.idl
* Sunday, February 14, 2016 7:24:55 PM CET
*/

public final class RunningMicrosvcHolder implements org.omg.CORBA.portable.Streamable
{
  public com.prismtech.agentv.core.types.RunningMicrosvc value = null;

  public RunningMicrosvcHolder ()
  {
  }

  public RunningMicrosvcHolder (com.prismtech.agentv.core.types.RunningMicrosvc initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.prismtech.agentv.core.types.RunningMicrosvcHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.prismtech.agentv.core.types.RunningMicrosvcHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.prismtech.agentv.core.types.RunningMicrosvcHelper.type ();
  }

}
