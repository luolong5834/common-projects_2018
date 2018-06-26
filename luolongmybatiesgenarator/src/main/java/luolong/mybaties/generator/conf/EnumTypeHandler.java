package luolong.mybaties.generator.conf;

import luolong.mybaties.generator.enums.CodeBaseEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <p></p>
 *
 * @author luolong
 * @date 2018/6/26
 */
public class EnumTypeHandler extends BaseTypeHandler<CodeBaseEnum>{

    private Class<CodeBaseEnum> clazz;

    public EnumTypeHandler(Class<CodeBaseEnum> enumType) {
        if (enumType == null)
            throw new IllegalArgumentException("Type argument cannot be null");
        this.clazz = enumType;
    }

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, CodeBaseEnum codeBaseEnum, JdbcType jdbcType) throws SQLException {

    }

    public CodeBaseEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return codeOf(clazz, resultSet.getInt(s));
    }

    public CodeBaseEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return codeOf(clazz, resultSet.getInt(i));
    }

    public CodeBaseEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return codeOf(clazz, callableStatement.getInt(i));
    }

    public static CodeBaseEnum codeOf(Class<CodeBaseEnum> enumClass, int code) {
        CodeBaseEnum[] enumConstants = enumClass.getEnumConstants();
        for (CodeBaseEnum e : enumConstants) {
            if (e.code() == code)
                return e;
        }
        return null;
    }



}
