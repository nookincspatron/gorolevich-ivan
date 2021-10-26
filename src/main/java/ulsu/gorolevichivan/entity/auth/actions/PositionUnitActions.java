package ulsu.gorolevichivan.entity.auth.actions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class PositionUnitActions {

    @Column(name = "position_unit_create")
    private Boolean positionUnitCreate = null;

    @Column(name = "position_unit_edit")
    private Boolean positionUnitEdit = null;

    @Override
    public boolean equals(Object object) {
        PositionUnitActions that = (PositionUnitActions) object;

        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        if (positionUnitCreate != null ? !positionUnitCreate.equals(that.positionUnitCreate) : that.positionUnitCreate != null)
            return false;
        return positionUnitEdit != null ? positionUnitEdit.equals(that.positionUnitEdit) : that.positionUnitEdit == null;
    }
}