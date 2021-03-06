package uff.ic.letstalk.corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentHandleHelper.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

abstract public class ComponentHandleHelper {
	private static String _id = "IDL:corbaObjects/scs/ComponentHandle/ComponentHandle:1.0";

	public static void insert(org.omg.CORBA.Any a,
			uff.ic.letstalk.corbaObjects.scs.ComponentHandle that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static uff.ic.letstalk.corbaObjects.scs.ComponentHandle extract(org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	private static boolean __active = false;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			synchronized (org.omg.CORBA.TypeCode.class) {
				if (__typeCode == null) {
					if (__active) {
						return org.omg.CORBA.ORB.init()
								.create_recursive_tc(_id);
					}
					__active = true;
					org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember[3];
					org.omg.CORBA.TypeCode _tcOf_members0 = null;
					_tcOf_members0 = uff.ic.letstalk.corbaObjects.scs.IComponentHelper.type();
					_members0[0] = new org.omg.CORBA.StructMember("cmp",
							_tcOf_members0, null);
					_tcOf_members0 = uff.ic.letstalk.corbaObjects.scs.ComponentIdHelper.type();
					_members0[1] = new org.omg.CORBA.StructMember("id",
							_tcOf_members0, null);
					_tcOf_members0 = org.omg.CORBA.ORB.init().get_primitive_tc(
							org.omg.CORBA.TCKind.tk_ulong);
					_members0[2] = new org.omg.CORBA.StructMember(
							"instance_id", _tcOf_members0, null);
					__typeCode = org.omg.CORBA.ORB.init().create_struct_tc(uff.ic.letstalk.corbaObjects.scs.ComponentHandleHelper.id(),
							"ComponentHandle", _members0);
					__active = false;
				}
			}
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static uff.ic.letstalk.corbaObjects.scs.ComponentHandle read(
			org.omg.CORBA.portable.InputStream istream) {
		uff.ic.letstalk.corbaObjects.scs.ComponentHandle value = new uff.ic.letstalk.corbaObjects.scs.ComponentHandle();
		value.cmp = uff.ic.letstalk.corbaObjects.scs.IComponentHelper.read(istream);
		value.id = uff.ic.letstalk.corbaObjects.scs.ComponentIdHelper.read(istream);
		value.instance_id = istream.read_ulong();
		return value;
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			uff.ic.letstalk.corbaObjects.scs.ComponentHandle value) {
		uff.ic.letstalk.corbaObjects.scs.IComponentHelper.write(ostream, value.cmp);
		uff.ic.letstalk.corbaObjects.scs.ComponentIdHelper.write(ostream, value.id);
		ostream.write_ulong(value.instance_id);
	}

}
