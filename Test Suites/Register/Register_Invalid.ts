<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Register_Invalid</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>59a2c139-fea0-4db6-9891-418f1e55cdc2</testSuiteGuid>
   <testCaseLink>
      <guid>6665ba20-f9b3-4640-9a7c-f51d6b3a7d84</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register with an invalid email format</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>45ba96db-a1bd-4fa6-a821-c0f68b2a6cef</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>85ee7bc4-717b-4938-95fb-6439cf28036a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register with an email that already exists in the system</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>2-2</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e3133e2c-4a0d-4caa-9460-dd8cc75cfee3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>8d28c660-f85b-4837-927c-54e7fa40f8c4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register with the fullname field is left blank</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>71631d9c-2d09-42f9-9609-779f5609c2d4</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>3-3</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>71631d9c-2d09-42f9-9609-779f5609c2d4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>19a1cd7c-779d-4d88-b4a3-b0dfd847c53c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register when the phone number field is left blank</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>4-4</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc73ee1c-88ae-4fbe-acaa-02a4cea3ef6e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>3e314c15-b834-4183-8797-211eefc084a5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register with an invalid phone number format</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e811403e-03de-44c2-a348-6cd6cf274208</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>5-5</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e811403e-03de-44c2-a348-6cd6cf274208</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>ff08aa88-0e1c-4e0c-9f82-626b9ab95113</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register when the detail location is left blank</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>39cf935f-d81c-4c5b-beea-fd7658ab2afa</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>6-6</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>39cf935f-d81c-4c5b-beea-fd7658ab2afa</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>6dee80e4-cea0-4f29-885c-04c5076eddb8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register when the password field and confirm password are left blank</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>373df008-8141-4356-9203-c062ff3d42ec</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>7-7</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>373df008-8141-4356-9203-c062ff3d42ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2ed1b971-3987-4181-91b4-0ed5a778d538</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register without selecting city, district, and ward</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>8-8</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2266142d-e382-4f6c-b7be-9e7ecdf7ba22</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>226b8e68-57c5-46e8-9dde-43f9f95835fe</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register when password and confirm password do not match</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>589e4be6-bb2e-4735-b14b-b1ac19c371b5</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>9-9</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2de5b727-2508-43b2-bb7a-c0accf1289f6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user cannot register when the email field is left blank</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>9cba1d48-6482-4ceb-b538-9d8bb3260b28</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>10-10</value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Invalid_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>16b13773-58bf-414d-b03a-8d053b711581</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>509a8982-6b70-4787-96ef-6f2e84c8d058</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>1a9f0608-1d58-43b4-9fc6-00321e64b2df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>895034fb-6a57-4f12-beff-5051f594c250</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>a115cc55-67a5-48db-a739-1e6a5f20319d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>e3739095-baeb-4cf5-b3d4-065cc68da25e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>1871da12-30e2-4cd6-b418-ed61b916c845</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>03fadbcc-f02c-4928-9c09-39200fc5a4f6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>130fa7de-9217-4a96-ade4-b504387eede9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9cba1d48-6482-4ceb-b538-9d8bb3260b28</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_error</value>
         <variableId>56ad30be-54c6-4588-a27b-e3dc5bfa004f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>9fb29c04-7803-4782-9daa-c52cad1aa872</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_REGISTER_USER/Verify user register success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>9648ea81-9960-4bea-9d60-8c6c81e87e9c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Register/Register_Success_Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>9f32d9d2-ad56-4ade-b149-88e8a6826796</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>46711955-78f3-4078-9219-e92fa2aa94c0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>a3f67cd0-377f-4752-8230-ea5bd2f8e30f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>0d856601-6fcd-4c7d-ae89-60868d1dd1b7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>phone</value>
         <variableId>c22311ce-0992-4574-b854-3f8fe8690dd2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>052ca6c6-ec92-4fd6-ab43-dd3f30b5e5ee</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>district</value>
         <variableId>8839a449-f6f4-4b7c-a9d9-c9412d742079</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>locate</value>
         <variableId>f794ebfa-e863-47fc-9324-e96317e7e794</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>detail_location</value>
         <variableId>ed81d7e6-ad54-4a6c-b21f-963f07231f77</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9648ea81-9960-4bea-9d60-8c6c81e87e9c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Expected_Success</value>
         <variableId>732fb566-f440-471f-8780-06e1380adefd</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
