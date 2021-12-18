package ulsu.gorolevichivan.entity.auth.actions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class EmployeeActions {

    @Column(name = "employee_create")
    private Boolean employeeCreate = null;

    @Column(name = "position_create")
    private Boolean positionCreate = null;

    @Column(name = "division_create")
    private Boolean divisionCreate = null;

    @Override
    public boolean equals(Object object) {
        EmployeeActions that = (EmployeeActions) object;

        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        if (employeeCreate != null ? !employeeCreate.equals(that.employeeCreate) : that.employeeCreate != null)
            return false;
        if (positionCreate != null ? positionCreate.equals(that.positionCreate) : that.positionCreate != null)
            return false;
        return divisionCreate != null ? !divisionCreate.equals(that.divisionCreate) : that.divisionCreate == null;
    }
}