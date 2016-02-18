package com.prismtech.agentv.core.types;


/**
* com/prismtech/agentv/core/types/RepoActionKindHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:24:59 PM CET
*/

abstract public class RepoActionKindHelper
{
  private static String  _id = "IDL:com/prismtech/agentv/core/types/RepoActionKind:1.0";

  public static void insert (org.omg.CORBA.Any a, com.prismtech.agentv.core.types.RepoActionKind that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.prismtech.agentv.core.types.RepoActionKind extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (com.prismtech.agentv.core.types.RepoActionKindHelper.id (), "RepoActionKind", new String[] { "A_INSTALL", "A_UPGRADE", "A_REMOVE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.prismtech.agentv.core.types.RepoActionKind read (org.omg.CORBA.portable.InputStream istream)
  {
    return com.prismtech.agentv.core.types.RepoActionKind.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.prismtech.agentv.core.types.RepoActionKind value)
  {
    ostream.write_long (value.value ());
  }

}