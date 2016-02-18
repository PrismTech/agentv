package com.prismtech.agentv.microsvc.daytime.types;


/**
* com/prismtech/agentv/capsule/daytime/types/DayTime.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/types.idl
* Tuesday, February 9, 2016 11:46:34 PM CET
*/

public final class DayTime implements org.omg.CORBA.portable.IDLEntity
{
  public long currentTimeMillis = (long)0;
  public long nanoTime = (long)0;

  public DayTime ()
  {
  } // ctor

  public DayTime (long _currentTimeMillis, long _nanoTime)
  {
    currentTimeMillis = _currentTimeMillis;
    nanoTime = _nanoTime;
  } // ctor

} // class DayTime
