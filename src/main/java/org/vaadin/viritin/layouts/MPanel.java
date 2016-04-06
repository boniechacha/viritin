package org.vaadin.viritin.layouts;

import com.vaadin.server.Resource;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;
import org.vaadin.viritin.MSize;

/**
 * Fluent Panel
 */
public class MPanel extends Panel{

    public MPanel() {
        super();
    }

    public MPanel(Component content) {
        super(content);
    }

    public MPanel(String caption) {
        super(caption);
    }

    public MPanel(String caption, Component content) {
        super(caption, content);
    }

    public MPanel withCaption(String caption) {
        setCaption(caption);
        return this;
    }

    public MPanel withContent(Component content) {
        setContent(content);
        return this;
    }

    public MPanel withWidth(String width) {
        setWidth(width);
        return this;
    }

    public MPanel withWidth(float width, Unit unit) {
        setWidth(width, unit);
        return this;
    }

    public MPanel withFullWidth() {
        setWidth("100%");
        return this;
    }

    public MPanel withHeight(String height) {
        setHeight(height);
        return this;
    }

    public MPanel withHeight(float height, Unit unit) {
        setHeight(height, unit);
        return this;
    }

    public MPanel withFullHeight() {
        setHeight("100%");
        return this;
    }

    public MPanel withSize(MSize size) {
        setWidth(size.getWidth(), size.getWidthUnit());
        setHeight(size.getHeight(), size.getHeightUnit());
        return this;
    }

    public MPanel withStyleName(String... styleNames) {
        for (String styleName : styleNames) {
            addStyleName(styleName);
        }
        return this;
    }

    public MPanel withIcon(Resource icon) {
        setIcon(icon);
        return this;
    }
}
