/**
 * Copyright (C) 2010 Asterios Raptis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.alpharogroup.jgeohash.geoip;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import de.alpharogroup.jgeohash.GeoHashPoint;
import de.alpharogroup.jgeohash.api.Position;
import de.alpharogroup.jgeohash.distance.MeasuringUnit;

/**
 * The unit test class for the class {@link LocationExtensions}.
 */
public class LocationExtensionsTest
{

	/**
	 * Test method for {@link LocationExtensions#sortByDistance(Position, List, MeasuringUnit)}
	 */
	@Test
	public void testSortByDistance()
	{
		List<Position> geohashes = new ArrayList<>();
		geohashes.add(new GeoHashPoint("u0vf2w1s5tsy"));
		geohashes.add(new GeoHashPoint("u0t3z7cnznrx"));
		geohashes.add(new GeoHashPoint("u0td0v9xnz28"));
		Position startPoint = new GeoHashPoint("u11fyhzqhp3c");

		LocationExtensions.sortByDistance(startPoint, geohashes, MeasuringUnit.METER);

		geohashes = new ArrayList<>();
		geohashes.add(new GeoHashPoint("u0z4")); // below Wuerzburg
		geohashes.add(new GeoHashPoint("u1p1")); // right from Bad Hersfeld
		geohashes.add(new GeoHashPoint("u28j")); // Ingolstadt
		geohashes.add(new GeoHashPoint("u0zc4wp0k")); // Nurremberg at work
		startPoint = new GeoHashPoint("u0ww"); // Ludwigsburg

		LocationExtensions.sortByDistance(startPoint, geohashes, MeasuringUnit.METER);
	}

	/**
	 * Test method for {@link LocationExtensions#sortByDistanceInMeters(Position, List)}
	 */
	@Test
	public void testSortByDistanceInMeters()
	{
		// TODO
	}

}
