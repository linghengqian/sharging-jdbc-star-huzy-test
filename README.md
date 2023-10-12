# sharging-jdbc-star-huzy-test

# For https://github.com/apache/shardingsphere/issues/28704 .

- Verified under the Ubuntu 22.04.3 LTS by `SDKMAN!`. Need Docker CE to run testcontainers.
```shell
sdk install java 17.0.8.1-ms
sdk use java 17.0.8.1-ms

./mvnw -T1C clean test
```

- Error Log.
```shell
$ ./mvnw -T1C clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] Using the MultiThreadedBuilder implementation with a thread count of 6
[INFO] 
[INFO] ---------------------< org.example:sharging-jdbc >----------------------
[INFO] Building sharging-jdbc 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ sharging-jdbc ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/sharging-jdbc-star-huzy-test/target
[INFO] 
[INFO] --- resources:3.2.0:resources (default-resources) @ sharging-jdbc ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 4 resources
[INFO] 
[INFO] --- compiler:3.10.1:compile (default-compile) @ sharging-jdbc ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 9 source files to /home/linghengqian/TwinklingLiftWorks/git/public/sharging-jdbc-star-huzy-test/target/classes
[INFO] 
[INFO] --- resources:3.2.0:testResources (default-testResources) @ sharging-jdbc ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/sharging-jdbc-star-huzy-test/src/test/resources
[INFO] 
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ sharging-jdbc ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/linghengqian/TwinklingLiftWorks/git/public/sharging-jdbc-star-huzy-test/target/test-classes
[INFO] 
[INFO] --- surefire:2.22.2:test (default-test) @ sharging-jdbc ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.ShardingJdbcTest
09:49:29.692 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
09:49:29.703 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
09:49:29.748 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [org.example.ShardingJdbcTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
09:49:29.758 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [org.example.ShardingJdbcTest], using SpringBootContextLoader
09:49:29.761 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [org.example.ShardingJdbcTest]: class path resource [org/example/ShardingJdbcTest-context.xml] does not exist
09:49:29.762 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [org.example.ShardingJdbcTest]: class path resource [org/example/ShardingJdbcTestContext.groovy] does not exist
09:49:29.762 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [org.example.ShardingJdbcTest]: no resource found for suffixes {-context.xml, Context.groovy}.
09:49:29.763 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [org.example.ShardingJdbcTest]: ShardingJdbcTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
09:49:29.821 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [org.example.ShardingJdbcTest]
09:49:29.892 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/home/linghengqian/TwinklingLiftWorks/git/public/sharging-jdbc-star-huzy-test/target/classes/org/example/ShardingJdbcApplication.class]
09:49:29.893 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration org.example.ShardingJdbcApplication for test class org.example.ShardingJdbcTest
09:49:29.969 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [org.example.ShardingJdbcTest]: using defaults.
09:49:29.969 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
09:49:29.984 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@14fc1f0, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@4ae9cfc1, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@512baff6, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@632ceb35, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@1c93f6e1, org.springframework.test.context.support.DirtiesContextTestExecutionListener@1800a575, org.springframework.test.context.transaction.TransactionalTestExecutionListener@1458ed9c, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@10a9d961, org.springframework.test.context.event.EventPublishingTestExecutionListener@130e116b, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@e383572, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@5ddf0d24, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@363a52f, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@60856961, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@2fd953a6, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@a4add54]
09:49:29.988 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@30e868be testClass = ShardingJdbcTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@66c92293 testClass = ShardingJdbcTest, locations = '{}', classes = '{class org.example.ShardingJdbcApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@741a8937, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@bae7dc0, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@f0da945, org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@32502377, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@4c1909a3, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@543c6f6d], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.14)

2023-10-12 09:49:30.303  INFO 3433 --- [           main] org.example.ShardingJdbcTest             : Starting ShardingJdbcTest using Java 17.0.8.1 on DESKTOP-DJVVOB9 with PID 3433 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/sharging-jdbc-star-huzy-test)
2023-10-12 09:49:30.305  INFO 3433 --- [           main] org.example.ShardingJdbcTest             : No active profile set, falling back to 1 default profile: "default"
 _ _   |_  _ _|_. ___ _ |    _ 
| | |\/|_)(_| | |_\  |_)||_|_\ 
     /               |         
                        3.3.1 
2023-10-12 09:49:32.436  INFO 3433 --- [           main] org.example.ShardingJdbcTest             : Started ShardingJdbcTest in 2.41 seconds (JVM running for 3.41)
2023-10-12 09:49:32.821  INFO 3433 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-10-12 09:49:33.027  INFO 3433 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2023-10-12 09:49:33.278  INFO 3433 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2023-10-12 09:49:33.458  INFO 3433 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Starting...
2023-10-12 09:49:33.489  INFO 3433 --- [           main] o.t.utility.ImageNameSubstitutor         : Image name substitution will be performed by: DefaultImageNameSubstitutor (composite of 'ConfigurationFileImageNameSubstitutor' and 'PrefixingImageNameSubstitutor')
2023-10-12 09:49:33.628  INFO 3433 --- [           main] o.t.d.DockerClientProviderStrategy       : Loaded org.testcontainers.dockerclient.UnixSocketClientProviderStrategy from ~/.testcontainers.properties, will try it first
2023-10-12 09:49:33.827  INFO 3433 --- [           main] o.t.d.DockerClientProviderStrategy       : Found Docker environment with local Unix socket (unix:///var/run/docker.sock)
2023-10-12 09:49:33.829  INFO 3433 --- [           main] org.testcontainers.DockerClientFactory   : Docker host IP address is localhost
2023-10-12 09:49:33.849  INFO 3433 --- [           main] org.testcontainers.DockerClientFactory   : Connected to docker: 
  Server Version: 24.0.6
  API Version: 1.43
  Operating System: Docker Desktop
  Total Memory: 12974 MB
2023-10-12 09:49:33.880  INFO 3433 --- [           main] tc.testcontainers/ryuk:0.5.1             : Creating container for image: testcontainers/ryuk:0.5.1
2023-10-12 09:49:34.099  INFO 3433 --- [           main] o.t.utility.RegistryAuthLocator          : Credential helper/store (docker-credential-desktop.exe) does not have credentials for https://index.docker.io/v1/
2023-10-12 09:49:34.260  INFO 3433 --- [           main] tc.testcontainers/ryuk:0.5.1             : Container testcontainers/ryuk:0.5.1 is starting: fb1471e9ec781e88eb6ac95a6660a485e083ef6ea7cbcf1b9b01b47aa199c232
2023-10-12 09:49:34.739  INFO 3433 --- [           main] tc.testcontainers/ryuk:0.5.1             : Container testcontainers/ryuk:0.5.1 started in PT0.879701357S
2023-10-12 09:49:34.746  INFO 3433 --- [           main] o.t.utility.RyukResourceReaper           : Ryuk started - will monitor and terminate Testcontainers containers on JVM exit
2023-10-12 09:49:34.747  INFO 3433 --- [           main] org.testcontainers.DockerClientFactory   : Checking the system...
2023-10-12 09:49:34.747  INFO 3433 --- [           main] org.testcontainers.DockerClientFactory   : ✔︎ Docker server version should be at least 1.6.0
2023-10-12 09:49:34.750  INFO 3433 --- [           main] tc.mysql:5.7.34                          : Creating container for image: mysql:5.7.34
2023-10-12 09:49:34.956  INFO 3433 --- [           main] tc.mysql:5.7.34                          : Container mysql:5.7.34 is starting: 67a3240ce79fa85e177cc7a7a3905ef1e2b581d7f6f8891e859dc2dae79e6baa
2023-10-12 09:49:35.428  INFO 3433 --- [           main] tc.mysql:5.7.34                          : Waiting for database connection to become available at jdbc:mysql://localhost:51619/test using query 'SELECT 1'
2023-10-12 09:49:49.229  INFO 3433 --- [           main] tc.mysql:5.7.34                          : Container mysql:5.7.34 started in PT14.479285274S
2023-10-12 09:49:49.230  INFO 3433 --- [           main] tc.mysql:5.7.34                          : Container is started (JDBC URL: jdbc:mysql://localhost:51619/test)
2023-10-12 09:49:49.266  INFO 3433 --- [           main] org.testcontainers.ext.ScriptUtils       : Executing database script from db/app_test.sql
2023-10-12 09:49:49.376  INFO 3433 --- [           main] org.testcontainers.ext.ScriptUtils       : Executed database script from db/app_test.sql in 109 ms.
2023-10-12 09:49:49.386  INFO 3433 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Start completed.
2023-10-12 09:49:50.370  INFO 3433 --- [           main] com.zaxxer.hikari.pool.PoolBase          : HikariPool-1 - Driver does not support get/set network timeout for connections. (getNetworkTimeout)
2023-10-12 09:49:50.372  INFO 3433 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 22.07 s <<< FAILURE! - in org.example.ShardingJdbcTest
[ERROR] testIssues28704  Time elapsed: 19.202 s  <<< ERROR!
org.apache.ibatis.exceptions.PersistenceException: 

### Error updating database.  Cause: java.sql.SQLException: Routed target `t_order_1` does not exist, available targets are `[t_order]`.
### The error may exist in org/example/mapper/OrderMapper.java (best guess)
### The error may involve org.example.mapper.OrderMapper.insert-Inline
### The error occurred while setting parameters
### SQL: INSERT INTO t_order  ( id, order_no, member_id, amount, tenant_id )  VALUES  ( ?, ?, ?, ?, ? )
### Cause: java.sql.SQLException: Routed target `t_order_1` does not exist, available targets are `[t_order]`.
        at org.example.ShardingJdbcTest.testIssues28704(ShardingJdbcTest.java:36)
Caused by: java.sql.SQLException: Routed target `t_order_1` does not exist, available targets are `[t_order]`.
        at org.example.ShardingJdbcTest.testIssues28704(ShardingJdbcTest.java:36)

2023-10-12 09:49:51.763  INFO 3433 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-10-12 09:49:51.779  INFO 3433 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   ShardingJdbcTest.testIssues28704:36 » Persistence 
### Error updating database...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  28.824 s (Wall Clock)
[INFO] Finished at: 2023-10-12T09:49:52+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.2:test (default-test) on project sharging-jdbc: There are test failures.
[ERROR] 
[ERROR] Please refer to /home/linghengqian/TwinklingLiftWorks/git/public/sharging-jdbc-star-huzy-test/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```