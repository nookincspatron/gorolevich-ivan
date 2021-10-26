package ulsu.gorolevichivan.entity.auth.actions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class EmployeeActions {

    @Column(name = "employee_create")
    private Boolean employeeCreate = null;

    @Column(name = "employee_general_edit")
    private Boolean employeeGeneralEdit = null;

    @Column(name = "employee_action_edit")
    private Boolean employeeActionEdit = null;

    @Override
    public boolean equals(Object object) {
        EmployeeActions that = (EmployeeActions) object;

        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        if (employeeCreate != null ? !employeeCreate.equals(that.employeeCreate) : that.employeeCreate != null)
            return false;
        if (employeeGeneralEdit != null ? !employeeGeneralEdit.equals(that.employeeGeneralEdit) : that.employeeGeneralEdit != null)
            return false;
        return employeeActionEdit != null ? employeeActionEdit.equals(that.employeeActionEdit) : that.employeeActionEdit == null;
    }
}