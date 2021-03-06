package com.prismtech.agentv.core.types;


/**
* com/prismtech/agentv/core/types/RepoActionCaseHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:24:59 PM CET
*/

abstract public class RepoActionCaseHelper
{
  private static String  _id = "IDL:com/prismtech/agentv/core/types/RepoActionCase:1.0";

  public static void insert (org.omg.CORBA.Any a, com.prismtech.agentv.core.types.RepoActionCase that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.prismtech.agentv.core.types.RepoActionCase extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      org.omg.CORBA.TypeCode _disTypeCode0;
      _disTypeCode0 = com.prismtech.agentv.core.types.RepoActionKindHelper.type ();
      org.omg.CORBA.UnionMember[] _members0 = new org.omg.CORBA.UnionMember [3];
      org.omg.CORBA.TypeCode _tcOf_members0;
      org.omg.CORBA.Any _anyOf_members0;

      // Branch for install (case label A_INSTALL)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      com.prismtech.agentv.core.types.RepoActionKindHelper.insert (_anyOf_members0, com.prismtech.agentv.core.types.RepoActionKind.A_INSTALL);
      _tcOf_members0 = com.prismtech.agentv.core.types.InstallMicrosvcHelper.type ();
      _members0[0] = new org.omg.CORBA.UnionMember (
        "install",
        _anyOf_members0,
        _tcOf_members0,
        null);

      // Branch for upgrade (case label A_UPGRADE)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      com.prismtech.agentv.core.types.RepoActionKindHelper.insert (_anyOf_members0, com.prismtech.agentv.core.types.RepoActionKind.A_UPGRADE);
      _tcOf_members0 = com.prismtech.agentv.core.types.UpgradeMicrosvcHelper.type ();
      _members0[1] = new org.omg.CORBA.UnionMember (
        "upgrade",
        _anyOf_members0,
        _tcOf_members0,
        null);

      // Branch for remove (case label A_REMOVE)
      _anyOf_members0 = org.omg.CORBA.ORB.init ().create_any ();
      com.prismtech.agentv.core.types.RepoActionKindHelper.insert (_anyOf_members0, com.prismtech.agentv.core.types.RepoActionKind.A_REMOVE);
      _tcOf_members0 = com.prismtech.agentv.core.types.RemoveMicrosvcHelper.type ();
      _members0[2] = new org.omg.CORBA.UnionMember (
        "remove",
        _anyOf_members0,
        _tcOf_members0,
        null);
      __typeCode = org.omg.CORBA.ORB.init ().create_union_tc (com.prismtech.agentv.core.types.RepoActionCaseHelper.id (), "RepoActionCase", _disTypeCode0, _members0);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.prismtech.agentv.core.types.RepoActionCase read (org.omg.CORBA.portable.InputStream istream)
  {
    com.prismtech.agentv.core.types.RepoActionCase value = new com.prismtech.agentv.core.types.RepoActionCase ();
    com.prismtech.agentv.core.types.RepoActionKind _dis0 = null;
    _dis0 = com.prismtech.agentv.core.types.RepoActionKindHelper.read (istream);
    switch (_dis0.value ())
    {
      case com.prismtech.agentv.core.types.RepoActionKind._A_INSTALL:
        com.prismtech.agentv.core.types.InstallMicrosvc _install = null;
        _install = com.prismtech.agentv.core.types.InstallMicrosvcHelper.read (istream);
        value.install (_install);
        break;
      case com.prismtech.agentv.core.types.RepoActionKind._A_UPGRADE:
        com.prismtech.agentv.core.types.UpgradeMicrosvc _upgrade = null;
        _upgrade = com.prismtech.agentv.core.types.UpgradeMicrosvcHelper.read (istream);
        value.upgrade (_upgrade);
        break;
      case com.prismtech.agentv.core.types.RepoActionKind._A_REMOVE:
        com.prismtech.agentv.core.types.RemoveMicrosvc _remove = null;
        _remove = com.prismtech.agentv.core.types.RemoveMicrosvcHelper.read (istream);
        value.remove (_remove);
        break;
    }
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.prismtech.agentv.core.types.RepoActionCase value)
  {
    com.prismtech.agentv.core.types.RepoActionKindHelper.write (ostream, value.discriminator ());
    switch (value.discriminator ().value ())
    {
      case com.prismtech.agentv.core.types.RepoActionKind._A_INSTALL:
        com.prismtech.agentv.core.types.InstallMicrosvcHelper.write (ostream, value.install ());
        break;
      case com.prismtech.agentv.core.types.RepoActionKind._A_UPGRADE:
        com.prismtech.agentv.core.types.UpgradeMicrosvcHelper.write (ostream, value.upgrade ());
        break;
      case com.prismtech.agentv.core.types.RepoActionKind._A_REMOVE:
        com.prismtech.agentv.core.types.RemoveMicrosvcHelper.write (ostream, value.remove ());
        break;
    }
  }

}
