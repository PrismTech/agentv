package com.prismtech.agentv.core.types;


/**
* com/prismtech/agentv/core/types/RepoActionKind.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:24:59 PM CET
*/

public class RepoActionKind implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static com.prismtech.agentv.core.types.RepoActionKind[] __array = new com.prismtech.agentv.core.types.RepoActionKind [__size];

  public static final int _A_INSTALL = 0;
  public static final com.prismtech.agentv.core.types.RepoActionKind A_INSTALL = new com.prismtech.agentv.core.types.RepoActionKind(_A_INSTALL);
  public static final int _A_UPGRADE = 1;
  public static final com.prismtech.agentv.core.types.RepoActionKind A_UPGRADE = new com.prismtech.agentv.core.types.RepoActionKind(_A_UPGRADE);
  public static final int _A_REMOVE = 2;
  public static final com.prismtech.agentv.core.types.RepoActionKind A_REMOVE = new com.prismtech.agentv.core.types.RepoActionKind(_A_REMOVE);

  public int value ()
  {
    return __value;
  }

  public static com.prismtech.agentv.core.types.RepoActionKind from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected RepoActionKind (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class RepoActionKind
