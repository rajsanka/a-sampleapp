/**
 * SMART - State Machine ARchiTecture
 *
 * Copyright (C) 2012 Individual contributors as indicated by
 * the @authors tag
 *
 * This file is a part of SMART.
 *
 * SMART is a free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SMART is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * */
 
/**
 * ************************************************************
 * HEADERS
 * ************************************************************
 * File:                org.anon.sampleapp.register.RegisterEvent
 * Author:              rsankar
 * Revision:            1.0
 * Date:                02-04-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * An event to register
 *
 * ************************************************************
 * */

package org.anon.sampleapp.register;

import java.util.List;
public class RegisterEvent implements java.io.Serializable
{
    private String email;
    private String phone;
    private int age;
    private double weight;
    private List<Byte> password;
    private Long salary;

    public RegisterEvent()
    {
    }

    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public List<Byte> getPassword() { return password; }
    public Long getSalary() { return salary; }
}

