package org.rapla.plugin.tableview.client;

import java.util.Collection;

import org.rapla.client.PopupContext;
import org.rapla.client.base.View;
import org.rapla.entities.domain.Reservation;
import org.rapla.plugin.tableview.client.CalendarTableView.Presenter;

public interface CalendarTableView<W> extends View<Presenter> {

    interface Presenter {

        void selectReservation(Reservation selectedObject,PopupContext context);
    }

    void update(Collection<Reservation> result);

    W provideContent();

}
