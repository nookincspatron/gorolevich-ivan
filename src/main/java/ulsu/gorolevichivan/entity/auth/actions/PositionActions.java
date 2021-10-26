package ulsu.gorolevichivan.entity.auth.actions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class PositionActions {

    @Column(name = "position_create")
    private Boolean positionCreate = null;

    @Column(name = "position_edit")
    private Boolean positionEdit = null;

    @Override
    public boolean equals(Object object) {
        PositionActions that = (PositionActions) object;

        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        if (positionCreate != null ? !positionCreate.equals(that.positionCreate) : that.positionCreate != null)
            return false;
        return positionEdit != null ? positionEdit.equals(that.positionEdit) : that.positionEdit == null;
    }
}