package com.prismtech.agentv.core.types;

/**
* com/prismtech/agentv/core/types/RepoActionKindHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:24:59 PM CET
*/

public final class RepoActionKindHolder implements org.omg.CORBA.portable.Streamable
{
  public com.prismtech.agentv.core.types.RepoActionKind value = null;

  public RepoActionKindHolder ()
  {
  }

  public RepoActionKindHolder (com.prismtech.agentv.core.types.RepoActionKind initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.prismtech.agentv.core.types.RepoActionKindHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.prismtech.agentv.core.types.RepoActionKindHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.prismtech.agentv.core.types.RepoActionKindHelper.type ();
  }

}
