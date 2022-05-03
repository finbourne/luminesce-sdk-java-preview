/*
 * FINBOURNE Honeycomb Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.7.42
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.luminesce.api;

import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.model.LusidProblemDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SqlExecutionApi
 */
@Ignore
public class SqlExecutionApiTest {

    private final SqlExecutionApi api = new SqlExecutionApi();

    
    /**
     * [EXPERIMENTAL] GetByQueryCsv: Executes Sql, returned in CSV format, where the sql is simply in the url.
     *
     *  For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByQueryCsvTest() throws ApiException {
        String query = null;
        String queryName = null;
        Boolean download = null;
        Integer timeout = null;
        String response = api.getByQueryCsv(query, queryName, download, timeout);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded) format, where the sql is simply in the url.
     *
     *  For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByQueryExcelTest() throws ApiException {
        String query = null;
        String queryName = null;
        Integer timeout = null;
        String response = api.getByQueryExcel(query, queryName, timeout);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetByQueryJson: Executes Sql, returned in JSON format, where the sql is simply in the url.
     *
     *  For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByQueryJsonTest() throws ApiException {
        String query = null;
        String queryName = null;
        Integer timeout = null;
        Boolean jsonProper = null;
        String response = api.getByQueryJson(query, queryName, timeout, jsonProper);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is simply in the url.
     *
     *  For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByQueryPipeTest() throws ApiException {
        String query = null;
        String queryName = null;
        Boolean download = null;
        Integer timeout = null;
        String response = api.getByQueryPipe(query, queryName, download, timeout);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] GetByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded) format, where the sql is simply in the url.
     *
     *  For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByQuerySqliteTest() throws ApiException {
        String query = null;
        String queryName = null;
        Integer timeout = null;
        String response = api.getByQuerySqlite(query, queryName, timeout);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] PutByQueryCsv: Executes Sql, returned in CSV format, where the sql is the post-body url.
     *
     *  For more complex HoneycombSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putByQueryCsvTest() throws ApiException {
        String body = null;
        String queryName = null;
        Boolean download = null;
        Integer timeoutSeconds = null;
        String response = api.putByQueryCsv(body, queryName, download, timeoutSeconds);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] PutByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded), where the sql is the post-body url.
     *
     *  For more complex HoneycombSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putByQueryExcelTest() throws ApiException {
        String body = null;
        String queryName = null;
        Integer timeoutSeconds = null;
        String response = api.putByQueryExcel(body, queryName, timeoutSeconds);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] PutByQueryJson: Executes Sql, returned in JSON format, where the sql is the post-body url.
     *
     *  For more complex HoneycombSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putByQueryJsonTest() throws ApiException {
        String body = null;
        String queryName = null;
        Integer timeoutSeconds = null;
        Boolean jsonProper = null;
        String response = api.putByQueryJson(body, queryName, timeoutSeconds, jsonProper);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] PutByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is the post-body url.
     *
     *  For more complex HoneycombSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putByQueryPipeTest() throws ApiException {
        String body = null;
        String queryName = null;
        Boolean download = null;
        Integer timeoutSeconds = null;
        String response = api.putByQueryPipe(body, queryName, download, timeoutSeconds);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] PutByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded), where the sql is the post-body url.
     *
     *  For more complex HoneycombSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putByQuerySqliteTest() throws ApiException {
        String body = null;
        String queryName = null;
        Integer timeoutSeconds = null;
        String response = api.putByQuerySqlite(body, queryName, timeoutSeconds);

        // TODO: test validations
    }
    
    /**
     * [EXPERIMENTAL] PutQueryToFormat: Executes Sql, returned in JSON format, where the sql is the post-body url.
     *
     *  This formats SQL (given a set of options as to how to do so). It takes some SQL (or a fragment thereof, it need not fully parse as yet and certainly need not execute correctly) and returns the reformatted version. e.g. &#x60;&#x60;&#x60;sql select x,y,z from a inner join b on a.x&#x3D;b.x where x&gt;y or y!&#x3D;z &#x60;&#x60;&#x60; becomes &#x60;&#x60;&#x60;sql select x, y, z from a inner join b    on a.x &#x3D; b.x where x &gt; y    or y !&#x3D; z &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putQueryToFormatTest() throws ApiException {
        String body = null;
        Boolean trailingCommas = null;
        Boolean uppercaseKeywords = null;
        Boolean breakJoinOnSections = null;
        Boolean spaceAfterExpandedComma = null;
        Boolean keywordStandardization = null;
        Boolean expandCommaLists = null;
        Boolean expandInLists = null;
        Boolean expandBooleanExpressions = null;
        Boolean expandBetweenConditions = null;
        Boolean expandCaseStatements = null;
        Integer maxLineWidth = null;
        String response = api.putQueryToFormat(body, trailingCommas, uppercaseKeywords, breakJoinOnSections, spaceAfterExpandedComma, keywordStandardization, expandCommaLists, expandInLists, expandBooleanExpressions, expandBetweenConditions, expandCaseStatements, maxLineWidth);

        // TODO: test validations
    }
    
}