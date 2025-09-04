package br.com.dio.service;

import java.util.*;

import static br.com.dio.service.EventEnum.CLEAR_SPACE;

public class NotifierService {

    private final Map<EventEnum, List<IEventListener>> listeners = new HashMap<>(){{
        put(CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscribe(final EventEnum eventType, IEventListener listener){
        var selectedListeners = listeners.get(eventType);
        selectedListeners.add(listener);
    }

    public void notify(final EventEnum eventType){
        listeners.get(eventType).forEach(l -> l.update(eventType));
    }
}
