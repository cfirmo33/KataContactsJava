/*
 * Copyright (C) 2015 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.karumi.katagenda.domain;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AgendaTest {

  @Test public void shouldReturnAnEmptyListOfContactsIfTheAgendaIsEmpty() {
    Agenda agenda = givenAnAgenda();

    List<Contact> contacts = agenda.getContacts();

    assertTrue(contacts.isEmpty());
  }

  private Agenda givenAnAgenda() {
    return new Agenda();
  }
}