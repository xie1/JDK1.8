/*
 * Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang;

/**
 * The Boolean class wraps a value of the primitive type
 * {@code boolean} in an object. An object of type
 * {@code Boolean} contains a single field whose type is
 * {@code boolean}.
 * <p>
 * In addition, this class provides many methods for
 * converting a {@code boolean} to a {@code String} and a
 * {@code String} to a {@code boolean}, as well as other
 * constants and methods useful when dealing with a
 * {@code boolean}.
 *
 * @author Arthur van Hoff
 * @since JDK1.0
 */


/**
 * 1、Boolean 是原始基本类型boolean的包装类
 * 2、Boolean包含基本类型的一样属性
 * 3、Boolean还提供许多由boolean转换成String方法，同样提供处理boolean的有用方法
 */
public final class Boolean implements java.io.Serializable,
        Comparable<Boolean> {
    /**
     * The {@code Boolean} object corresponding to the primitive
     * value {@code true}.
     */

    /**
     * 1、Boolean具有基本类型一样的值 Ture
     */
    public static final Boolean TRUE = new Boolean(true);

    /**
     * The {@code Boolean} object corresponding to the primitive
     * value {@code false}.
     */
    /**
     * 1、Boolean具有基本类型一样的值 false
     */
    public static final Boolean FALSE = new Boolean(false);

    /**
     * The Class object representing the primitive type boolean.
     *
     * @since JDK1.1
     */

    /**
     * 1、Boolean代表的是boolean的类的类型
     */
    @SuppressWarnings("unchecked")
    public static final Class<Boolean> TYPE = (Class<Boolean>) Class.getPrimitiveClass("boolean");

    /**
     * The value of the Boolean.
     *
     * @serial
     */

    private final boolean value;

    /**
     * use serialVersionUID from JDK 1.0.2 for interoperability
     */
    private static final long serialVersionUID = -3665804199014368530L;

    /**
     * Allocates a {@code Boolean} object representing the
     * {@code value} argument.
     * <p>
     * <p><b>Note: It is rarely appropriate to use this constructor.
     * Unless a <i>new</i> instance is required, the static factory
     * {@link #valueOf(boolean)} is generally a better choice. It is
     * likely to yield significantly better space and time performance.</b>
     *
     * @param value the value of the {@code Boolean}.
     */

//    提供有参构造方法，根据boolean类型的参数进行实例化Boolean
//    Boolean表示的是参数value生成的布尔对象
//    很少使用这个构造器进行实例Boolean，除非是需要实例化这个值，比较常用通过静态工厂方法，valueOf(boolean)
//     valueOf(boolean)具有更好的空间和时间的效率的表现
    public Boolean(boolean value) {
        this.value = value;
    }

    /**
     * Allocates a {@code Boolean} object representing the value
     * {@code true} if the string argument is not {@code null}
     * and is equal, ignoring case, to the string {@code "true"}.
     * Otherwise, allocate a {@code Boolean} object representing the
     * value {@code false}. Examples:<p>
     * {@code new Boolean("True")} produces a {@code Boolean} object
     * that represents {@code true}.<br>
     * {@code new Boolean("yes")} produces a {@code Boolean} object
     * that represents {@code false}.
     *
     * @param s the string to be converted to a {@code Boolean}.
     */
//    字符串进行转换成Boolean，要求非空的参数，字符串的字符等于true
//    不然其他的字符全部都会转换成false值
//    方法内调用的是parseBoolean方法
    public Boolean(String s) {
        this(parseBoolean(s));
    }

    /**
     * Parses the string argument as a boolean.  The {@code boolean}
     * returned represents the value {@code true} if the string argument
     * is not {@code null} and is equal, ignoring case, to the string
     * {@code "true"}. <p>
     * Example: {@code Boolean.parseBoolean("True")} returns {@code true}.<br>
     * Example: {@code Boolean.parseBoolean("yes")} returns {@code false}.
     *
     * @param s the {@code String} containing the boolean
     *          representation to be parsed
     * @return the boolean represented by the string argument
     * @since 1.5
     */

//    这个方法类似于Boolean(String s),通过传入根据非空的true字符串进行转成True的布尔值
    public static boolean parseBoolean(String s) {
        return ((s != null) && s.equalsIgnoreCase("true"));
    }

    /**
     * Returns the value of this {@code Boolean} object as a boolean
     * primitive.
     *
     * @return the primitive {@code boolean} value of this object.
     */
//    这个方法是转成基本类型的方法
    public boolean booleanValue() {
        return value;
    }

    public static void main(String[] args) {
        Boolean b = true;
        System.out.println(b.booleanValue());
    }

    /**
     * Returns a {@code Boolean} instance representing the specified
     * {@code boolean} value.  If the specified {@code boolean} value
     * is {@code true}, this method returns {@code Boolean.TRUE};
     * if it is {@code false}, this method returns {@code Boolean.FALSE}.
     * If a new {@code Boolean} instance is not required, this method
     * should generally be used in preference to the constructor
     * {@link #Boolean(boolean)}, as this method is likely to yield
     * significantly better space and time performance.
     *
     * @param b a boolean value.
     * @return a {@code Boolean} instance representing {@code b}.
     * @since 1.4
     */
    public static Boolean valueOf(boolean b) {
        return (b ? TRUE : FALSE);
    }

    /**
     * Returns a {@code Boolean} with a value represented by the
     * specified string.  The {@code Boolean} returned represents a
     * true value if the string argument is not {@code null}
     * and is equal, ignoring case, to the string {@code "true"}.
     *
     * @param s a string.
     * @return the {@code Boolean} value represented by the string.
     */
    public static Boolean valueOf(String s) {
        return parseBoolean(s) ? TRUE : FALSE;
    }

    /**
     * Returns a {@code String} object representing the specified
     * boolean.  If the specified boolean is {@code true}, then
     * the string {@code "true"} will be returned, otherwise the
     * string {@code "false"} will be returned.
     *
     * @param b the boolean to be converted
     * @return the string representation of the specified {@code boolean}
     * @since 1.4
     */
//    返回特定布尔的字符串
    public static String toString(boolean b) {
        return b ? "true" : "false";
    }

    /**
     * Returns a {@code String} object representing this Boolean's
     * value.  If this object represents the value {@code true},
     * a string equal to {@code "true"} is returned. Otherwise, a
     * string equal to {@code "false"} is returned.
     *
     * @return a string representation of this object.
     */
//    Object方法，实现ObjectoString方法
    public String toString() {
        return value ? "true" : "false";
    }

    /**
     * Returns a hash code for this {@code Boolean} object.
     *
     * @return the integer {@code 1231} if this object represents
     * {@code true}; returns the integer {@code 1237} if this
     * object represents {@code false}.
     */

//    实现了Object的hashCode方法。通过调用Boolean的hasCode方法返回
    @Override
    public int hashCode() {
        return Boolean.hashCode(value);
    }

    /**
     * Returns a hash code for a {@code boolean} value; compatible with
     * {@code Boolean.hashCode()}.
     *
     * @param value the value to hash
     * @return a hash code value for a {@code boolean} value.
     * @since 1.8
     */
//  true的话返回的是1231，false的话hashCode是1237
    public static int hashCode(boolean value) {
        return value ? 1231 : 1237;
    }

    /**
     * Returns {@code true} if and only if the argument is not
     * {@code null} and is a {@code Boolean} object that
     * represents the same {@code boolean} value as this object.
     *
     * @param obj the object to compare with.
     * @return {@code true} if the Boolean objects represent the
     * same value; {@code false} otherwise.
     */
//    Object方法
//    obj如果是Boolean的一个实例。返回比较的值
    public boolean equals(Object obj) {
        if (obj instanceof Boolean) {
            return value == ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /**
     * Returns {@code true} if and only if the system property
     * named by the argument exists and is equal to the string
     * {@code "true"}. (Beginning with version 1.0.2 of the
     * Java<small><sup>TM</sup></small> platform, the test of
     * this string is case insensitive.) A system property is accessible
     * through {@code getProperty}, a method defined by the
     * {@code System} class.
     * <p>
     * If there is no property with the specified name, or if the specified
     * name is empty or null, then {@code false} is returned.
     *
     * @param name the system property name.
     * @return the {@code boolean} value of the system property.
     * @throws SecurityException for the same reasons as
     *                           {@link System#getProperty(String) System.getProperty}
     * @see java.lang.System#getProperty(java.lang.String)
     * @see java.lang.System#getProperty(java.lang.String, java.lang.String)
     */
//    系统属性的名字等于ture返回的ture，等于false返回fasle
    public static boolean getBoolean(String name) {
        boolean result = false;
        try {
            result = parseBoolean(System.getProperty(name));
        } catch (IllegalArgumentException | NullPointerException e) {
        }
        return result;
    }

    /**
     * Compares this {@code Boolean} instance with another.
     *
     * @param b the {@code Boolean} instance to be compared
     * @return zero if this object represents the same boolean value as the
     * argument; a positive value if this object represents true
     * and the argument represents false; and a negative value if
     * this object represents false and the argument represents true
     * @throws NullPointerException if the argument is {@code null}
     * @see Comparable
     * @since 1.5
     */
//    实现compareTo方法
//    b表示要比较的实例
//    0表示这个对象和传入的参数对象相等
//    1表示这个对象是true，参数是false
//    -1表示这个对象是false,参数是true
    public int compareTo(Boolean b) {
        return compare(this.value, b.value);
    }

    /**
     * Compares two {@code boolean} values.
     * The value returned is identical to what would be returned by:
     * <pre>
     *    Boolean.valueOf(x).compareTo(Boolean.valueOf(y))
     * </pre>
     *
     * @param x the first {@code boolean} to compare
     * @param y the second {@code boolean} to compare
     * @return the value {@code 0} if {@code x == y};
     * a value less than {@code 0} if {@code !x && y}; and
     * a value greater than {@code 0} if {@code x && !y}
     * @since 1.7
     */
    public static int compare(boolean x, boolean y) {
        return (x == y) ? 0 : (x ? 1 : -1);
    }

    /**
     * Returns the result of applying the logical AND operator to the
     * specified {@code boolean} operands.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the logical AND of {@code a} and {@code b}
     * @see java.util.function.BinaryOperator
     * @since 1.8
     */
//    方法返回的表示逻辑上的与操作
    public static boolean logicalAnd(boolean a, boolean b) {
        return a && b;
    }

    /**
     * Returns the result of applying the logical OR operator to the
     * specified {@code boolean} operands.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the logical OR of {@code a} and {@code b}
     * @see java.util.function.BinaryOperator
     * @since 1.8
     */
//    方法表示逻辑上的或操作
    public static boolean logicalOr(boolean a, boolean b) {
        return a || b;
    }

    /**
     * Returns the result of applying the logical XOR operator to the
     * specified {@code boolean} operands.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the logical XOR of {@code a} and {@code b}
     * @see java.util.function.BinaryOperator
     * @since 1.8
     */
//    方法表示逻辑上的异或
    public static boolean logicalXor(boolean a, boolean b) {
        return a ^ b;
    }
}
