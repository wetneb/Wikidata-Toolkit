package org.wikidata.wdtk.datamodel.helpers;

/*
 * #%L
 * Wikidata Toolkit Data Model
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.wikidata.wdtk.datamodel.implementation.DataObjectFactoryImpl;
import org.wikidata.wdtk.datamodel.interfaces.*;

/**
 * This class contains static methods to create WDTK data objects. This is the
 * preferred way of creating data objects in WDTK.
 *
 * @author Markus Kroetzsch
 */
public class Datamodel {

	/**
	 * The site IRI of Wikidata.
	 */
	static final public String SITE_WIKIDATA = "http://www.wikidata.org/entity/";

	/**
	 * The site IRI of Wikimedia Commons.
	 */
	static final public String SITE_WIKIMEDIA_COMMONS = "http://commons.wikimedia.org/entity/";

	private final static DataObjectFactory factory = new DataObjectFactoryImpl();

	/**
	 * Creates an {@link ItemIdValue}.
	 *
	 * @param id
	 *            a string of the form Qn... where n... is the string
	 *            representation of a positive integer number
	 * @param siteIri
	 *            IRI to identify the site, usually the first part of the entity
	 *            IRI of the site this belongs to, e.g.,
	 *            "http://www.wikidata.org/entity/"
	 * @return an {@link ItemIdValue} corresponding to the input
	 */
	public static ItemIdValue makeItemIdValue(String id, String siteIri) {
		return factory.getItemIdValue(id, siteIri);
	}

	/**
	 * Creates an {@link ItemIdValue} for Wikidata.
	 *
	 * @param id
	 *            a string of the form Qn... where n... is the string
	 *            representation of a positive integer number
	 * @return an {@link ItemIdValue} corresponding to the input
	 */
	public static ItemIdValue makeWikidataItemIdValue(String id) {
		return factory.getItemIdValue(id, SITE_WIKIDATA);
	}

	/**
	 * Creates a {@link PropertyIdValue}.
	 *
	 * @param id
	 *            a string of the form Pn... where n... is the string
	 *            representation of a positive integer number
	 * @param siteIri
	 *            IRI to identify the site, usually the first part of the entity
	 *            IRI of the site this belongs to, e.g.,
	 *            "http://www.wikidata.org/entity/"
	 * @return a {@link PropertyIdValue} corresponding to the input
	 */
	public static PropertyIdValue makePropertyIdValue(String id, String siteIri) {
		return factory.getPropertyIdValue(id, siteIri);
	}

	/**
	 * Creates a {@link PropertyIdValue}.
	 *
	 * @param id
	 *            a string of the form Pn... where n... is the string
	 *            representation of a positive integer number
	 * @return a {@link PropertyIdValue} corresponding to the input
	 */
	public static PropertyIdValue makeWikidataPropertyIdValue(String id) {
		return factory.getPropertyIdValue(id, SITE_WIKIDATA);
	}

	/**
	 * Creates an {@link LexemeIdValue}.
	 *
	 * @param id
	 *            a string of the form Ln... where n... is the string
	 *            representation of a positive integer number
	 * @param siteIri
	 *            IRI to identify the site, usually the first part of the entity
	 *            IRI of the site this belongs to, e.g.,
	 *            "http://www.wikidata.org/entity/"
	 * @return an {@link LexemeIdValue} corresponding to the input
	 */
	public static LexemeIdValue makeLexemeIdValue(String id, String siteIri) {
		return factory.getLexemeIdValue(id, siteIri);
	}

	/**
	 * Creates an {@link LexemeIdValue} for Wikidata.
	 *
	 * @param id
	 *            a string of the form Ln... where n... is the string
	 *            representation of a positive integer number
	 * @return an {@link LexemeIdValue} corresponding to the input
	 */
	public static LexemeIdValue makeWikidataLexemeIdValue(String id) {
		return factory.getLexemeIdValue(id, SITE_WIKIDATA);
	}

	/**
	 * Creates an {@link FormIdValue}.
	 *
	 * @param id
	 *            a string of the form Ln...-Fm... where n... and m... are the string
	 *            representation of a positive integer number
	 * @param siteIri
	 *            IRI to identify the site, usually the first part of the entity
	 *            IRI of the site this belongs to, e.g.,
	 *            "http://www.wikidata.org/entity/"
	 * @return an {@link FormIdValue} corresponding to the input
	 */
	public static FormIdValue makeFormIdValue(String id, String siteIri) {
		return factory.getFormIdValue(id, siteIri);
	}

	/**
	 * Creates an {@link FormIdValue} for Wikidata.
	 *
	 * @param id
	 *            a string of the form Ln...-F... where n... and m... are the string
	 *            representation of a positive integer number
	 * @return an {@link FormIdValue} corresponding to the input
	 */
	public static FormIdValue makeWikidataFormIdValue(String id) {
		return factory.getFormIdValue(id, SITE_WIKIDATA);
	}

	/**
	 * Creates an {@link SenseIdValue}.
	 *
	 * @param id
	 *            a string of the form Ln...-Sm... where n... and m... are the string
	 *            representation of a positive integer number
	 * @param siteIri
	 *            IRI to identify the site, usually the first part of the entity
	 *            IRI of the site this belongs to, e.g.,
	 *            "http://www.wikidata.org/entity/"
	 * @return an {@link SenseIdValue} corresponding to the input
	 */
	public static SenseIdValue makeSenseIdValue(String id, String siteIri) {
		return factory.getSenseIdValue(id, siteIri);
	}

	/**
	 * Creates an {@link SenseIdValue} for Wikidata.
	 *
	 * @param id
	 *            a string of the form Ln...-S... where n... and m... are the string
	 *            representation of a positive integer number
	 * @return an {@link SenseIdValue} corresponding to the input
	 */
	public static SenseIdValue makeWikidataSenseIdValue(String id) {
		return factory.getSenseIdValue(id, SITE_WIKIDATA);
	}

	/**
	 * Creates an {@link MediaInfoIdValue}.
	 *
	 * @param id
	 *            a string of the form Mn... where n... is the string
	 *            representation of a positive integer number
	 * @param siteIri
	 *            IRI to identify the site, usually the first part of the entity
	 *            IRI of the site this belongs to, e.g.,
	 *            "http://www.wikidata.org/entity/"
	 * @return an {@link MediaInfoIdValue} corresponding to the input
	 */
	public static MediaInfoIdValue makeMediaInfoIdValue(String id, String siteIri) {
		return factory.getMediaInfoIdValue(id, siteIri);
	}

	/**
	 * Creates an {@link MediaInfoIdValue} for Wikimedia Commons.
	 *
	 * @param id
	 *            a string of the form Mn... where n... is the string
	 *            representation of a positive integer number
	 * @return an {@link MediaInfoIdValue} corresponding to the input
	 */
	public static MediaInfoIdValue makeWikimediaCommonsMediaInfoIdValue(String id) {
		return factory.getMediaInfoIdValue(id, SITE_WIKIMEDIA_COMMONS);
	}

	/**
	 * Creates a {@link DatatypeIdValue}. The datatype IRI is usually one of the
	 * constants defined in {@link DatatypeIdValue}, but this is not enforced,
	 * since there might be extensions that provide additional types.
	 *
	 * @param id
	 *            the IRI string that identifies the datatype
	 * @return a {@link DatatypeIdValue} corresponding to the input
	 */
	public static DatatypeIdValue makeDatatypeIdValue(String id) {
		return factory.getDatatypeIdValue(id);
	}

	/**
	 * Creates a {@link TimeValue}.
	 *
	 * @param year
	 *            a year number, where 0 refers to 1BCE
	 * @param month
	 *            a month number between 1 and 12
	 * @param day
	 *            a day number between 1 and 31
	 * @param hour
	 *            an hour number between 0 and 23
	 * @param minute
	 *            a minute number between 0 and 59
	 * @param second
	 *            a second number between 0 and 60 (possible leap second)
	 * @param precision
	 *            a value in the range of {@link TimeValue#PREC_DAY}, ...,
	 *            {@link TimeValue#PREC_1GY}
	 * @param beforeTolerance
	 *            non-negative integer tolerance before the value; see
	 *            {@link TimeValue#getBeforeTolerance()}
	 * @param afterTolerance
	 *            non-zero, positive integer tolerance before the value; see
	 *            {@link TimeValue#getAfterTolerance()}
	 * @param timezoneOffset
	 *            offset in minutes that should be applied when displaying this
	 *            time
	 * @param calendarModel
	 *            the IRI of the calendar model preferred when displaying the
	 *            date; usually {@link TimeValue#CM_GREGORIAN_PRO} or
	 *            {@link TimeValue#CM_JULIAN_PRO}
	 * @return a {@link TimeValue} corresponding to the input
	 */
	public static TimeValue makeTimeValue(long year, byte month, byte day,
			byte hour, byte minute, byte second, byte precision,
			int beforeTolerance, int afterTolerance, int timezoneOffset,
			String calendarModel) {
		return factory.getTimeValue(year, month, day, hour, minute, second,
				precision, beforeTolerance, afterTolerance, timezoneOffset,
				calendarModel);
	}

	/**
	 * Creates a {@link TimeValue} for a given date and time. The precision is
	 * automatically set to {@link TimeValue#PREC_SECOND}.
	 *
	 * @param year
	 *            a year number, where 0 refers to 1BCE
	 * @param month
	 *            a month number between 1 and 12
	 * @param day
	 *            a day number between 1 and 31
	 * @param hour
	 *            an hour number between 0 and 23
	 * @param minute
	 *            a minute number between 0 and 59
	 * @param second
	 *            a second number between 0 and 60 (possible leap second)
	 * @param timezoneOffset
	 *            offset in minutes that should be applied when displaying this
	 *            time
	 * @param calendarModel
	 *            the IRI of the calendar model preferred when displaying the
	 *            date; usually {@link TimeValue#CM_GREGORIAN_PRO} or
	 *            {@link TimeValue#CM_JULIAN_PRO}
	 * @return a {@link TimeValue} corresponding to the input
	 */
	public static TimeValue makeTimeValue(long year, byte month, byte day,
			byte hour, byte minute, byte second, int timezoneOffset,
			String calendarModel) {
		return factory.getTimeValue(year, month, day, hour, minute, second,
				TimeValue.PREC_SECOND, 0, 0, timezoneOffset, calendarModel);
	}

	/**
	 * Creates a {@link TimeValue} for a given date. The precision is
	 * automatically set to {@link TimeValue#PREC_DAY}.
	 *
	 * @param year
	 *            a year number, where 0 refers to 1BCE
	 * @param month
	 *            a month number between 1 and 12
	 * @param day
	 *            a day number between 1 and 31
	 * @param calendarModel
	 *            the IRI of the calendar model preferred when displaying the
	 *            date; usually {@link TimeValue#CM_GREGORIAN_PRO} or
	 *            {@link TimeValue#CM_JULIAN_PRO}
	 * @return a {@link TimeValue} corresponding to the input
	 */
	public static TimeValue makeTimeValue(long year, byte month, byte day,
			String calendarModel) {
		return factory.getTimeValue(year, month, day, (byte) 0, (byte) 0,
				(byte) 0, TimeValue.PREC_DAY, 0, 0, 0, calendarModel);
	}

	/**
	 * Creates a {@link GlobeCoordinatesValue}.
	 *
	 * @param latitude
	 *            the latitude of the coordinates in degrees
	 * @param longitude
	 *            the longitude of the coordinates in degrees
	 * @param precision
	 *            the precision of the coordinates in degrees
	 * @param globeIri
	 *            IRI specifying the celestial objects of the coordinates
	 * @return a {@link GlobeCoordinatesValue} corresponding to the input
	 */
	public static GlobeCoordinatesValue makeGlobeCoordinatesValue(
			double latitude, double longitude, double precision, String globeIri) {
		return factory.getGlobeCoordinatesValue(latitude, longitude, precision,
				globeIri);
	}

	/**
	 * Creates a {@link StringValue}.
	 *
	 * @param string
	 * @return a {@link StringValue} corresponding to the input
	 */
	public static StringValue makeStringValue(String string) {
		return factory.getStringValue(string);
	}

	/**
	 * Creates a {@link MonolingualTextValue}.
	 *
	 * @param text
	 *            the text of the value
	 * @param languageCode
	 *            the language code of the value
	 * @return a {@link MonolingualTextValue} corresponding to the input
	 */
	public static MonolingualTextValue makeMonolingualTextValue(String text,
			String languageCode) {
		return factory.getMonolingualTextValue(text, languageCode);
	}

	/**
	 * Creates a {@link QuantityValue}.
	 *
	 * @param numericValue
	 *            the numeric value of this quantity
	 * @param lowerBound
	 *            the lower bound of the numeric value of this quantity
	 * @param upperBound
	 *            the upper bound of the numeric value of this quantity
	 * @param unit
	 *            the unit identifier to use for this quantity
	 * @return a {@link QuantityValue} corresponding to the input
	 */
	public static QuantityValue makeQuantityValue(BigDecimal numericValue,
			BigDecimal lowerBound, BigDecimal upperBound, ItemIdValue unit) {
		return factory.getQuantityValue(numericValue, lowerBound, upperBound,
				unit);
	}

	/**
	 * Creates a {@link QuantityValue} without bounds.
	 *
	 * @param numericValue
	 *            the numeric value of this quantity
	 * @param unit
	 *            the unit identifier to use for this quantity
	 * @return a {@link QuantityValue} corresponding to the input
	 */
	public static QuantityValue makeQuantityValue(BigDecimal numericValue, ItemIdValue unit) {
		return factory.getQuantityValue(numericValue, unit);
	}

	/**
	 * Creates a {@link QuantityValue} with an empty unit.
	 *
	 * @param numericValue
	 *            the numeric value of this quantity
	 * @param lowerBound
	 *            the lower bound of the numeric value of this quantity
	 * @param upperBound
	 *            the upper bound of the numeric value of this quantity
	 * @return a {@link QuantityValue} corresponding to the input
	 */
	public static QuantityValue makeQuantityValue(BigDecimal numericValue,
			BigDecimal lowerBound, BigDecimal upperBound) {
		return factory.getQuantityValue(numericValue, lowerBound, upperBound);
	}

	/**
	 * Creates a {@link QuantityValue} with an empty unit and without bounds.
	 *
	 * @param numericValue
	 *            the numeric value of this quantity
	 * @return a {@link QuantityValue} corresponding to the input
	 */
	public static QuantityValue makeQuantityValue(BigDecimal numericValue) {
		return factory.getQuantityValue(numericValue);
	}

	/**
	 * Creates a {@link QuantityValue} from long numbers.
	 *
	 * @param numericValue
	 *            the numeric value of this quantity
	 * @param lowerBound
	 *            the lower bound of the numeric value of this quantity
	 * @param upperBound
	 *            the upper bound of the numeric value of this quantity
	 * @return a {@link QuantityValue} corresponding to the input
	 */
	public static QuantityValue makeQuantityValue(long numericValue,
			long lowerBound, long upperBound) {
		return factory.getQuantityValue(new BigDecimal(numericValue),
				new BigDecimal(lowerBound), new BigDecimal(upperBound));
	}

	/**
	 * Creates a {@link ValueSnak}.
	 *
	 * @param propertyId
	 * @param value
	 * @return a {@link ValueSnak} corresponding to the input
	 */
	public static ValueSnak makeValueSnak(PropertyIdValue propertyId,
			Value value) {
		return factory.getValueSnak(propertyId, value);
	}

	/**
	 * Creates a {@link SomeValueSnak}.
	 *
	 * @param propertyId
	 * @return a {@link SomeValueSnak} corresponding to the input
	 */
	public static SomeValueSnak makeSomeValueSnak(PropertyIdValue propertyId) {
		return factory.getSomeValueSnak(propertyId);
	}

	/**
	 * Creates a {@link NoValueSnak}.
	 *
	 * @param propertyId
	 * @return a {@link NoValueSnak} corresponding to the input
	 */
	public static NoValueSnak makeNoValueSnak(PropertyIdValue propertyId) {
		return factory.getNoValueSnak(propertyId);
	}

	/**
	 * Creates a {@link SnakGroup}.
	 *
	 * @param snaks
	 *            a non-empty list of snaks that use the same property
	 * @return a {@link SnakGroup} corresponding to the input
	 */
	public static SnakGroup makeSnakGroup(List<? extends Snak> snaks) {
		return factory.getSnakGroup(snaks);
	}

	/**
	 * Creates a {@link Claim}. It might be more convenient to use
	 * {@link #makeStatement} directly if you want to build a statement.
	 *
	 * @param subject
	 *            the subject the Statement refers to
	 * @param mainSnak
	 *            the main Snak of the Statement
	 * @param qualifiers
	 *            the qualifiers of the Statement, grouped in SnakGroups
	 * @return a {@link Claim} corresponding to the input
	 */
	public static Claim makeClaim(EntityIdValue subject, Snak mainSnak,
			List<SnakGroup> qualifiers) {
		return factory.getClaim(subject, mainSnak, qualifiers);
	}

	/**
	 * Creates a {@link Reference}. It might be more convenient to use the
	 * {@link ReferenceBuilder} instead.
	 *
	 * @param snakGroups
	 *            list of snak groups
	 * @return a {@link Reference} corresponding to the input
	 */
	public static Reference makeReference(List<SnakGroup> snakGroups) {
		return factory.getReference(snakGroups);
	}

	/**
	 * Creates a {@link Statement}. It might be more convenient to use the
	 * {@link StatementBuilder} instead.
	 * <p>
	 * The string id is used mainly for communication with a Wikibase site, in
	 * order to refer to statements of that site. When creating new statements
	 * that are not on any site, the empty string can be used.
	 *
	 * @param subject
	 *            the subject the Statement refers to
	 * @param mainSnak
	 *            the main Snak of the Statement
	 * @param qualifiers
	 *            the qualifiers of the Statement, grouped in SnakGroups
	 * @param references
	 *            the references for the Statement
	 * @param rank
	 *            the rank of the Statement
	 * @param statementId
	 *            the string id of the Statement
	 * @return a {@link Statement} corresponding to the input
	 */
	public static Statement makeStatement(EntityIdValue subject, Snak mainSnak,
										  List<SnakGroup> qualifiers, List<Reference> references,
										  StatementRank rank, String statementId) {
		return factory.getStatement(subject, mainSnak, qualifiers, references, rank, statementId);
	}

	/**
	 * Creates a {@link Statement}. It might be more convenient to use the
	 * {@link StatementBuilder} instead.
	 * <p>
	 * The string id is used mainly for communication with a Wikibase site, in
	 * order to refer to statements of that site. When creating new statements
	 * that are not on any site, the empty string can be used.
	 *
	 * @param claim
	 *            the main claim the Statement refers to
	 * @param references
	 *            the references for the Statement
	 * @param rank
	 *            the rank of the Statement
	 * @param statementId
	 *            the string id of the Statement
	 * @return a {@link Statement} corresponding to the input
	 */
	public static Statement makeStatement(Claim claim,
			List<Reference> references, StatementRank rank,
			String statementId) {
		return factory.getStatement(claim, references, rank, statementId);
	}

	/**
	 * Creates a {@link StatementGroup}.
	 *
	 * @param statements
	 *            a non-empty list of statements that use the same subject and
	 *            main-snak property in their claim
	 * @return a {@link StatementGroup} corresponding to the input
	 */
	public static StatementGroup makeStatementGroup(List<Statement> statements) {
		return factory.getStatementGroup(statements);
	}

	/**
	 * Creates a {@link SiteLink}.
	 *
	 * @param title
	 *            the title string of the linked page, including namespace
	 *            prefixes if any
	 * @param siteKey
	 *            the string key of the site of the linked article
	 * @param badges
	 *            the list of badges of the linked article
	 * @return a {@link SiteLink} corresponding to the input
	 */
	public static SiteLink makeSiteLink(String title, String siteKey,
			List<ItemIdValue> badges) {
		return factory.getSiteLink(title, siteKey, badges);
	}

	/**
	 * Creates a {@link SiteLink} without badges.
	 *
	 * @param title
	 *            the title string of the linked page, including namespace
	 *            prefixes if any
	 * @param siteKey
	 *            the string key of the site of the linked article
	 * @return a {@link SiteLink} corresponding to the input
	 */
	public static SiteLink makeSiteLink(String title, String siteKey) {
		return factory.getSiteLink(title, siteKey, Collections.emptyList());
	}

	/**
	 * Creates an empty {@link PropertyDocument}.
	 *
	 * @param propertyId
	 *            the id of the property that data is about
	 * @param datatypeId
	 *            the datatype of that property
	 * @return a {@link PropertyDocument} corresponding to the input
	 */
	public static PropertyDocument makePropertyDocument(PropertyIdValue propertyId, DatatypeIdValue datatypeId) {
		return makePropertyDocument(propertyId, Collections.emptyList(), Collections.emptyList(),
				Collections.emptyList(), Collections.emptyList(), datatypeId);
	}

	/**
	 * Creates a {@link PropertyDocument} with empty revision id. It might be
	 * more convenient to use the {@link PropertyDocumentBuilder} instead.
	 *
	 * @param propertyId
	 *            the id of the property that data is about
	 * @param labels
	 *            the list of labels of this property, with at most one label
	 *            for each language code
	 * @param descriptions
	 *            the list of descriptions of this property, with at most one
	 *            description for each language code
	 * @param aliases
	 *            the list of aliases of this property
	 * @param statementGroups
	 *            the list of statement groups of this item; all of them must
	 *            have the given itemIdValue as their subject
	 * @param datatypeId
	 *            the datatype of that property
	 * @return a {@link PropertyDocument} corresponding to the input
	 */
	public static PropertyDocument makePropertyDocument(
			PropertyIdValue propertyId, List<MonolingualTextValue> labels,
			List<MonolingualTextValue> descriptions,
			List<MonolingualTextValue> aliases,
			List<StatementGroup> statementGroups, DatatypeIdValue datatypeId) {
		return makePropertyDocument(propertyId, labels, descriptions, aliases,
				statementGroups, datatypeId, 0);
	}

	/**
	 * Creates a {@link PropertyDocument}. It might be more convenient to use
	 * the {@link PropertyDocumentBuilder} instead.
	 *
	 * @param propertyId
	 *            the id of the property that data is about
	 * @param labels
	 *            the list of labels of this property, with at most one label
	 *            for each language code
	 * @param descriptions
	 *            the list of descriptions of this property, with at most one
	 *            description for each language code
	 * @param aliases
	 *            the list of aliases of this property
	 * @param statementGroups
	 *            the list of statement groups of this item; all of them must
	 *            have the given itemIdValue as their subject
	 * @param datatypeId
	 *            the datatype of that property
	 * @param revisionId
	 *            the revision ID or 0 if not known; see
	 *            {@link EntityDocument#getRevisionId()}
	 * @return a {@link PropertyDocument} corresponding to the input
	 */
	public static PropertyDocument makePropertyDocument(
			PropertyIdValue propertyId, List<MonolingualTextValue> labels,
			List<MonolingualTextValue> descriptions,
			List<MonolingualTextValue> aliases,
			List<StatementGroup> statementGroups, DatatypeIdValue datatypeId,
			long revisionId) {
		return factory.getPropertyDocument(propertyId, labels, descriptions,
				aliases, statementGroups, datatypeId, revisionId);
	}

	/**
	 * Creates an empty{@link ItemDocument}.
	 *
	 * @param itemIdValue
	 *            the id of the item that data is about
	 * @return an {@link ItemDocument} corresponding to the input
	 */
	public static ItemDocument makeItemDocument(ItemIdValue itemIdValue) {
		return makeItemDocument(itemIdValue, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(),
				Collections.emptyList(), Collections.emptyMap(), 0);
	}

	/**
	 * Creates an {@link ItemDocument} with empty revision id. It might be more
	 * convenient to use the {@link ItemDocumentBuilder} instead.
	 *
	 * @param itemIdValue
	 *            the id of the item that data is about
	 * @param labels
	 *            the list of labels of this item, with at most one label for
	 *            each language code
	 * @param descriptions
	 *            the list of descriptions of this item, with at most one
	 *            description for each language code
	 * @param aliases
	 *            the list of aliases of this item
	 * @param statementGroups
	 *            the list of statement groups of this item; all of them must
	 *            have the given itemIdValue as their subject
	 * @param siteLinks
	 *            the sitelinks of this item by site key
	 * @return an {@link ItemDocument} corresponding to the input
	 */
	public static ItemDocument makeItemDocument(ItemIdValue itemIdValue,
			List<MonolingualTextValue> labels,
			List<MonolingualTextValue> descriptions,
			List<MonolingualTextValue> aliases,
			List<StatementGroup> statementGroups,
			Map<String, SiteLink> siteLinks) {
		return makeItemDocument(itemIdValue, labels, descriptions, aliases,
				statementGroups, siteLinks, 0);
	}

	/**
	 * Creates an {@link ItemDocument}. It might be more convenient to use the
	 * {@link ItemDocumentBuilder} instead.
	 *
	 * @param itemIdValue
	 *            the id of the item that data is about
	 * @param labels
	 *            the list of labels of this item, with at most one label for
	 *            each language code
	 * @param descriptions
	 *            the list of descriptions of this item, with at most one
	 *            description for each language code
	 * @param aliases
	 *            the list of aliases of this item
	 * @param statementGroups
	 *            the list of statement groups of this item; all of them must
	 *            have the given itemIdValue as their subject
	 * @param siteLinks
	 *            the sitelinks of this item by site key
	 * @param revisionId
	 *            the revision ID or 0 if not known; see
	 *            {@link EntityDocument#getRevisionId()}
	 * @return an {@link ItemDocument} corresponding to the input
	 */
	public static ItemDocument makeItemDocument(ItemIdValue itemIdValue,
			List<MonolingualTextValue> labels,
			List<MonolingualTextValue> descriptions,
			List<MonolingualTextValue> aliases,
			List<StatementGroup> statementGroups,
			Map<String, SiteLink> siteLinks, long revisionId) {
		return factory.getItemDocument(itemIdValue, labels, descriptions,
				aliases, statementGroups, siteLinks, revisionId);
	}

	/**
	 * Creates an empty {@link LexemeDocument}.
	 *
	 * @param lexemeIdValue
	 *            the id of the lexeme that data is about
	 * @param lexicalCategory
	 *            the lexical category to which the lexeme belongs
	 *            (noun, verb...)
	 * @param language
	 *            the language to which the lexeme belongs
	 * 	          (French, British English...)
	 * @param lemmas
	 *            the human readable representations of the lexeme
	 * @return a {@link LexemeDocument} corresponding to the input
	 */
	public static LexemeDocument makeLexemeDocument(LexemeIdValue lexemeIdValue,
			ItemIdValue lexicalCategory, ItemIdValue language, List<MonolingualTextValue> lemmas) {
		return makeLexemeDocument(lexemeIdValue, lexicalCategory, language,
				lemmas, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
	}

	/**
	 * Creates a {@link LexemeDocument}.
	 *
	 * @param lexemeIdValue
	 *            the id of the lexeme that data is about
	 * @param lexicalCategory
	 *            the lexical category to which the lexeme belongs
	 *            (noun, verb...)
	 * @param language
	 *            the language to which the lexeme belongs
	 * 	          (French, British English...)
	 * @param lemmas
	 *            the human readable representations of the lexeme
	 * @param statementGroups
	 *            the list of statement groups of this lexeme; all of them must
	 *            have the given lexemeIdValue as their subject
	 * @param forms
	 *            the forms of the lexeme
	 * @param senses
	 *            the senses of the lexeme
	 * @return a {@link LexemeDocument} corresponding to the input
	 */
	public static LexemeDocument makeLexemeDocument(LexemeIdValue lexemeIdValue,
			ItemIdValue lexicalCategory,
			ItemIdValue language,
			List<MonolingualTextValue> lemmas,
			List<StatementGroup> statementGroups,
			List<FormDocument> forms,
			List<SenseDocument> senses) {
		return factory.getLexemeDocument(lexemeIdValue, lexicalCategory, language, lemmas, statementGroups, forms, senses, 0);
	}


	/**
	 * Creates a {@link FormDocument}.
	 *
	 * If you plan to add this form to a specific lexeme,
	 * it might be easier to use {@link LexemeDocument#createForm(List)}.
	 *
	 * @param formIdValue
	 *            the id of the form that data is about
	 * @param representations
	 *            the list of representations of this lexeme, with at most one
	 *            lemma for each language code
	 * @param grammaticalFeatures
	 *            the grammatical features of the lexeme
	 * @param statementGroups
	 *            the list of statement groups of this lexeme; all of them must
	 *            have the given lexemeIdValue as their subject
	 * @return a {@link LexemeDocument} corresponding to the input
	 */
	public static FormDocument makeFormDocument(FormIdValue formIdValue,
			List<MonolingualTextValue> representations,
			List<ItemIdValue> grammaticalFeatures,
			List<StatementGroup> statementGroups) {
		return factory.getFormDocument(formIdValue, representations, grammaticalFeatures, statementGroups, 0);
	}

	/**
	 * Creates a {@link SenseDocument}.
	 *
	 * If you plan to add this sense to a specific lexeme,
	 * it might be easier to use {@link LexemeDocument#createSense(List)} )}.
	 *
	 * @param senseIdValue
	 *            the id of the form that data is about
	 * @param glosses
	 *            the list of glosses of this lexeme, with at most one
	 *            gloss for each language code
	 * @param statementGroups
	 *            the list of statement groups of this lexeme; all of them must
	 *            have the given lexemeIdValue as their subject
	 * @return a {@link SenseDocument} corresponding to the input
	 */
	public static SenseDocument makeSenseDocument(SenseIdValue senseIdValue,
												List<MonolingualTextValue> glosses,
												List<StatementGroup> statementGroups) {
		return factory.getSenseDocument(senseIdValue, glosses, statementGroups, 0);
	}

	/**
	 * Creates an empty {@link MediaInfoDocument}.
	 *
	 * @param mediaInfoIdValue
	 *            the id of the media that data is about
	 * @return an {@link MediaInfoDocument} corresponding to the input
	 */
	public static MediaInfoDocument makeMediaInfoDocument(MediaInfoIdValue mediaInfoIdValue) {
		return makeMediaInfoDocument(mediaInfoIdValue, Collections.emptyList(), Collections.emptyList());
	}

	/**
	 * Creates a {@link MediaInfoDocument}.
	 *
	 * @param mediaInfoIdValue
	 *            the id of the media that data is about
	 * @param labels
	 *            the list of labels of this media, with at most one label for
	 *            each language code
	 * @param statementGroups
	 *            the list of statement groups of this media info; all of them must
	 *            have the given mediaInfoIdValue as their subject
	 * @return an {@link MediaInfoDocument} corresponding to the input
	 */
	public static MediaInfoDocument makeMediaInfoDocument(MediaInfoIdValue mediaInfoIdValue,
												List<MonolingualTextValue> labels,
												List<StatementGroup> statementGroups) {
		return factory.getMediaInfoDocument(mediaInfoIdValue, labels, statementGroups, 0);
	}
}
