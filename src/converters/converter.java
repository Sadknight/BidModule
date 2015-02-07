package converters;

import model.Pantonespravochnik;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * Created by DMalenkov on 18.11.2014.
 */
@FacesConverter("pantoneConverter")
public class converter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s != null && s.trim().length() > 0) {
            try {
                model.Pantonespravochnik service = new Pantonespravochnik();
                service.setNamePantona(s);
                return service;
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {

        if (o != null) {

            String s = ((model.Pantonespravochnik) o).getNamePantona();
            return s;
        } else {
            return null;
        }
    }
}

