package ulsu.gorolevichivan.entity.auth.actions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class StructureActions {

    @Column(name = "employee_create")
    private Boolean employeeCreate = null;

    @Column(name = "employee_edit")
    private Boolean employeeEdit = null;

    @Column(name = "position_create")
    private Boolean positionCreate = null;

    @Column(name = "position_edit")
    private Boolean positionEdit = null;

    @Column(name = "division_create")
    private Boolean divisionCreate = null;

    @Column(name = "division_edit")
    private Boolean divisionEdit = null;

    @Override
    public boolean equals(Object object) {
        StructureActions that = (StructureActions) object;

        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        if (employeeCreate != null ? !employeeCreate.equals(that.employeeCreate) : that.employeeCreate != null)
            return false;
        if (employeeEdit != null ? !employeeEdit.equals(that.employeeEdit) : that.employeeEdit != null)
            return false;
        if (positionCreate != null ? positionCreate.equals(that.positionCreate) : that.positionCreate != null)
            return false;
        if (positionEdit != null ? positionEdit.equals(that.positionEdit) : that.positionEdit != null)
            return false;
        if (divisionCreate != null ? !divisionCreate.equals(that.divisionCreate) : that.divisionCreate != null)
            return false;
        return divisionEdit != null ? divisionEdit.equals(that.divisionEdit) : that.divisionEdit == null;
    }
}